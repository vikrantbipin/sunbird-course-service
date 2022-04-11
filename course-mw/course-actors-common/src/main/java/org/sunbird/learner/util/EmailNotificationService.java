package org.sunbird.learner.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.collections.CollectionUtils;
import org.apache.velocity.VelocityContext;
import org.mortbay.util.ajax.JSON;
import org.sunbird.cassandra.CassandraOperation;
import org.sunbird.common.Constants;
import org.sunbird.common.models.response.Response;
import org.sunbird.common.models.util.JsonKey;
import org.sunbird.common.models.util.LoggerUtil;
import org.sunbird.common.models.util.ProjectUtil;
import org.sunbird.common.models.util.mail.SendMail;
import org.sunbird.helper.ServiceFactory;
import org.sunbird.models.user.courses.*;

import java.util.*;
import java.util.stream.Collectors;

public class EmailNotificationService implements Runnable {
    public static final int millisfor3days = 3 * 1000 * 60 * 60 * 24;
    Gson gson = new Gson();
    Map<String, UserDetails> userCourseMap = new HashMap<>();
    Map<String, CourseDetails> courseIdAndCourseNameMap = new HashMap<>();
    private static final String SUNBIRD_KEY_SPACE_NAME = "sunbird";
    private static final String SUNBIRD_COURSES_KEY_SPACE_NAME = "sunbird_courses";
    private static LoggerUtil logger = new LoggerUtil(EmailNotificationService.class);
    private CassandraOperation cassandraOperation = ServiceFactory.getInstance();
    private ObjectMapper mapper = new ObjectMapper();

    public static void sendIncompleteCourseEmail(Map.Entry<String, UserDetails> entry) {
        try {
            if (!ProjectUtil.isStringNullOREmpty(entry.getValue().getEmail()) && entry.getValue().getIncompleteCourses().size() > 0) {
                String[] email = entry.getValue().getEmail().split(",");
                VelocityContext context = new VelocityContext();
                context.put(JsonKey.MAIL_SUBJECT,
                        Constants.INCOMPLETE_COURSES_MAIL_SUBJECT);
                for (int i = 0; i < entry.getValue().getIncompleteCourses().size(); i++) {
                    context.put("course" + String.valueOf(i+1), true);
                    context.put("course" + String.valueOf(i+1) + "_url", entry.getValue().getIncompleteCourses().get(i).getCourseUrl());
                    context.put("course" + String.valueOf(i+1) + "_thumbnail", entry.getValue().getIncompleteCourses().get(i).getThumbnail());
                    context.put("course" + String.valueOf(i+1) + "_name", entry.getValue().getIncompleteCourses().get(i).getCourseName());
                    context.put("course" + String.valueOf(i+1) + "_duration", entry.getValue().getIncompleteCourses().get(i).getCompletionPercentage());

                }
                context.put(Constants.FORMATTER, new org.apache.velocity.app.tools.VelocityFormatter(context));
                SendMail.sendMail(email,
                        Constants.INCOMPLETE_COURSES_MAIL_SUBJECT, context,
                        "incompletecourses.vm");
            }
        } catch (Exception e) {

        }
    }
    @Override
    public void run() {
        incompleteCourses();
    }

    public Map<String, UserDetails> incompleteCourses() {
        List<String> fields = new ArrayList<>(Arrays.asList("userid", "batchid", "courseid", "completionpercentage", "last_access_time"));
        Date date = new Date(new Date().getTime() - millisfor3days);
        Response response = cassandraOperation.searchByWhereClause(SUNBIRD_COURSES_KEY_SPACE_NAME, "user_content_consumption", fields, date);
        List<Map<String, Object>> userCoursesList =
                (List<Map<String, Object>>) response.get(JsonKey.RESPONSE);
        List<UserDetailsAndCourses> ud = new ArrayList<>();
        if (!CollectionUtils.isEmpty(userCoursesList)) {
            try {
                convertMaptoList(userCoursesList, ud);
                setUserCourseMap(ud, userCourseMap);
                Iterator<Map.Entry<String, UserDetails>> it = userCourseMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, UserDetails> set = (Map.Entry<String, UserDetails>) it.next();
                    sendIncompleteCourseEmail(set);
                }

                return userCourseMap;
            } catch (Exception e) {
                logger.info(null, e.getMessage());
            }
        }
        return null;
    }

    private void convertMaptoList(List<Map<String, Object>> userCoursesList, List<UserDetailsAndCourses> ud) throws JsonProcessingException {
        for (Map<String, Object> map : userCoursesList) {
            final UserDetailsAndCourses userDetails = mapper.convertValue(map, UserDetailsAndCourses.class);
            ud.add(userDetails);
        }
        List<String> courseIds = ud.stream().map(UserDetailsAndCourses::getCourseId).collect(Collectors.toList());
        getAndSetCourseName(courseIds);
        getAndSetUserEmail();
    }

    private void getAndSetCourseName(List<String> courseIds) throws JsonProcessingException {
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put(JsonKey.IDENTIFIER, courseIds);
        List<String> fields = new ArrayList<>(Arrays.asList(JsonKey.IDENTIFIER, JsonKey.HIERARCHY));
        Response response1 = cassandraOperation.getRecordsByProperties("dev_hierarchy_store", "content_hierarchy", propertyMap, fields, null);
        List<Map<String, Object>> coursesData =
                (List<Map<String, Object>>) response1.get(JsonKey.RESPONSE);
        for (Map<String, Object> map : coursesData) {
            if (map.get(JsonKey.IDENTIFIER) != null && map.get(JsonKey.HIERARCHY) != null && courseIdAndCourseNameMap.get(map.get(JsonKey.IDENTIFIER)) == null) {
                String courseData = map.get(JsonKey.HIERARCHY).toString();
                CourseData myPojo = gson.fromJson(courseData, CourseData.class);
                CourseDetails cd = new CourseDetails();
                if (myPojo.getChildren().get(0) != null) {
                    cd.setCourseName(myPojo.getChildren().get(0).getName());
                }
                if (myPojo.getPosterImage() != null) {
                    cd.setThumbnail(myPojo.getPosterImage());
                }
                courseIdAndCourseNameMap.put((String) map.get(JsonKey.IDENTIFIER), cd);
            }
        }
    }

    private void getAndSetUserEmail() {
        ArrayList<String> userIds = new ArrayList<>(userCourseMap.keySet());
        Map<String, Object> propertyMap = new HashMap<>();
        propertyMap.put(JsonKey.ID, userIds);
        List<String> fields1 = new ArrayList<>(Arrays.asList(JsonKey.ID, JsonKey.EMAIL));
        Response response1 = cassandraOperation.getRecordsByProperties("sunbird", "user", propertyMap, fields1, null);
        List<Map<String, Object>> userEmail =
                (List<Map<String, Object>>) response1.get(JsonKey.RESPONSE);
        for (Map<String, Object> map : userEmail) {
            if (map.get(JsonKey.EMAIL) != null && userCourseMap.get(map.get(JsonKey.ID)) != null)
                userCourseMap.get(map.get(JsonKey.ID)).setEmail((String) map.get(JsonKey.EMAIL));
        }
    }

    private void setUserCourseMap(List<UserDetailsAndCourses> ud, Map<String, UserDetails> userCourseMap) {
        for (UserDetailsAndCourses u : ud) {
            if (u.getCourseId() != null && u.getBatchId() != null && courseIdAndCourseNameMap.get(u.getCourseId()) != null && courseIdAndCourseNameMap.get(u.getCourseId()).getThumbnail() != null) {
                IncompleteCourses i = new IncompleteCourses();
                i.setCourseId(u.getCourseId());
                i.setCourseName(courseIdAndCourseNameMap.get(u.getCourseId()).getCourseName());
                i.setCompletionPercentage(u.getCompletionPercentage());
                i.setLastAccessedDate(u.getLastAccessTime());
                i.setBatchId(u.getBatchId());
                i.setThumbnail(courseIdAndCourseNameMap.get(u.getCourseId()).getThumbnail());
                if (u.getCourseId() != null && u.getBatchId() != null)
                    i.setCourseUrl("https://igot-dev.in/app/toc/" + u.getCourseId() + "/overview?batchId=" + u.getBatchId());
                if (userCourseMap.get(u.getUserId()) != null) {
                    if (userCourseMap.get(u.getUserId()).getIncompleteCourses().size() < 3) {
                        userCourseMap.get(u.getUserId()).getIncompleteCourses().add(i);
                        if (userCourseMap.get(u.getUserId()).getIncompleteCourses().size() == 3) {
                            userCourseMap.get(u.getUserId()).getIncompleteCourses().sort(Comparator.comparing(IncompleteCourses::getLastAccessedDate).reversed());
                        }
                    }
                } else {
                    UserDetails user = new UserDetails();
                    List<IncompleteCourses> ic = new ArrayList<>();
                    ic.add(i);
                    user.setIncompleteCourses(ic);
                    userCourseMap.put(u.getUserId(), user);
                }
            }
        }
    }
}
