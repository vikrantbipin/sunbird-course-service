package org.sunbird.models.user.courses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncompleteCourses implements Serializable {

  private static final long serialVersionUID = 1L;
  private String courseId;
  private String courseName;
  private String batchId;
  private Double completionPercentage;
  private Date lastAccessedDate;
  private String thumbnail;
  private String courseUrl;

  public String getCourseUrl() {
    return courseUrl;
  }

  public void setCourseUrl(String courseUrl) {
    this.courseUrl = courseUrl;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }
  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Double getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(Double completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public Date getLastAccessedDate() {
    return lastAccessedDate;
  }

  public void setLastAccessedDate(Date lastAccessedDate) {
    this.lastAccessedDate = lastAccessedDate;
  }

}
