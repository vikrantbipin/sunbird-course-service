
package org.sunbird.models.user.courses;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ownershipType",
    "instructions",
    "publisherIDs",
    "creatorContacts",
    "downloadUrl",
    "channel",
    "organisation",
    "language",
    "variants",
    "source",
    "mimeType",
    "leafNodes",
    "objectType",
    "appIcon",
    "primaryCategory",
    "children",
    "contentEncoding",
    "mimeTypesCount",
    "totalCompressedSize",
    "generateDIALCodes",
    "contentType",
    "trackable",
    "identifier",
    "audience",
    "toc_url",
    "visibility",
    "isExternal",
    "contentTypesCount",
    "consumerId",
    "childNodes",
    "discussionForum",
    "publisherDetails",
    "mediaType",
    "osId",
    "lastPublishedBy",
    "version",
    "prevState",
    "license",
    "size",
    "lastPublishedOn",
    "name",
    "reviewStatus",
    "creatorIDs",
    "status",
    "code",
    "competencies_v3",
    "credentials",
    "purpose",
    "prevStatus",
    "difficultyLevel",
    "description",
    "posterImage",
    "idealScreenSize",
    "createdOn",
    "learningMode",
    "duration",
    "contentDisposition",
    "lastUpdatedOn",
    "draftImage",
    "SYS_INTERNAL_LAST_UPDATED_ON",
    "dialcodeRequired",
    "creator",
    "createdFor",
    "lastStatusChangedOn",
    "os",
    "se_FWIds",
    "reviewer",
    "pkgVersion",
    "versionKey",
    "reviewerIDs",
    "idealScreenDensity",
    "s3Key",
    "depth",
    "framework",
    "lastSubmittedOn",
    "createdBy",
    "leafNodesCount",
    "compatibilityLevel",
    "userConsent",
    "batches"
})
@Generated("jsonschema2pojo")
public class CourseData {

    @JsonProperty("ownershipType")
    private List<String> ownershipType = null;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("publisherIDs")
    private List<String> publisherIDs = null;
    @JsonProperty("creatorContacts")
    private String creatorContacts;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("organisation")
    private List<String> organisation = null;
    @JsonProperty("language")
    private List<String> language = null;
    @JsonProperty("variants")
    private Variants variants;
    @JsonProperty("source")
    private String source;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("leafNodes")
    private List<String> leafNodes = null;
    @JsonProperty("objectType")
    private String objectType;
    @JsonProperty("appIcon")
    private String appIcon;
    @JsonProperty("primaryCategory")
    private String primaryCategory;
    @JsonProperty("children")
    private List<Child> children = null;
    @JsonProperty("contentEncoding")
    private String contentEncoding;
    @JsonProperty("mimeTypesCount")
    private String mimeTypesCount;
    @JsonProperty("totalCompressedSize")
    private Float totalCompressedSize;
    @JsonProperty("generateDIALCodes")
    private String generateDIALCodes;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("trackable")
    private Trackable__2 trackable;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("audience")
    private List<String> audience = null;
    @JsonProperty("toc_url")
    private String tocUrl;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("isExternal")
    private Boolean isExternal;
    @JsonProperty("contentTypesCount")
    private String contentTypesCount;
    @JsonProperty("consumerId")
    private String consumerId;
    @JsonProperty("childNodes")
    private List<String> childNodes = null;
    @JsonProperty("discussionForum")
    private String discussionForum;
    @JsonProperty("publisherDetails")
    private String publisherDetails;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("osId")
    private String osId;
    @JsonProperty("lastPublishedBy")
    private String lastPublishedBy;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("prevState")
    private String prevState;
    @JsonProperty("license")
    private String license;
    @JsonProperty("size")
    private Float size;
    @JsonProperty("lastPublishedOn")
    private String lastPublishedOn;
    @JsonProperty("name")
    private String name;
    @JsonProperty("reviewStatus")
    private String reviewStatus;
    @JsonProperty("creatorIDs")
    private List<String> creatorIDs = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("code")
    private String code;
    @JsonProperty("competencies_v3")
    private String competenciesV3;
    @JsonProperty("credentials")
    private Credentials__2 credentials;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("prevStatus")
    private String prevStatus;
    @JsonProperty("difficultyLevel")
    private String difficultyLevel;
    @JsonProperty("description")
    private String description;
    @JsonProperty("posterImage")
    private String posterImage;
    @JsonProperty("idealScreenSize")
    private String idealScreenSize;
    @JsonProperty("createdOn")
    private String createdOn;
    @JsonProperty("learningMode")
    private String learningMode;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("contentDisposition")
    private String contentDisposition;
    @JsonProperty("lastUpdatedOn")
    private String lastUpdatedOn;
    @JsonProperty("draftImage")
    private String draftImage;
    @JsonProperty("SYS_INTERNAL_LAST_UPDATED_ON")
    private String sysInternalLastUpdatedOn;
    @JsonProperty("dialcodeRequired")
    private String dialcodeRequired;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("createdFor")
    private List<String> createdFor = null;
    @JsonProperty("lastStatusChangedOn")
    private String lastStatusChangedOn;
    @JsonProperty("os")
    private List<String> os = null;
    @JsonProperty("se_FWIds")
    private List<String> seFWIds = null;
    @JsonProperty("reviewer")
    private String reviewer;
    @JsonProperty("pkgVersion")
    private Float pkgVersion;
    @JsonProperty("versionKey")
    private String versionKey;
    @JsonProperty("reviewerIDs")
    private List<String> reviewerIDs = null;
    @JsonProperty("idealScreenDensity")
    private String idealScreenDensity;
    @JsonProperty("s3Key")
    private String s3Key;
    @JsonProperty("depth")
    private Integer depth;
    @JsonProperty("framework")
    private String framework;
    @JsonProperty("lastSubmittedOn")
    private String lastSubmittedOn;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("leafNodesCount")
    private Integer leafNodesCount;
    @JsonProperty("compatibilityLevel")
    private Integer compatibilityLevel;
    @JsonProperty("userConsent")
    private String userConsent;
    @JsonProperty("batches")
    private List<Batch> batches = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CourseData() {
    }

    /**
     * 
     * @param ownershipType
     * @param instructions
     * @param publisherIDs
     * @param creatorContacts
     * @param downloadUrl
     * @param channel
     * @param organisation
     * @param language
     * @param variants
     * @param source
     * @param mimeType
     * @param leafNodes
     * @param objectType
     * @param appIcon
     * @param primaryCategory
     * @param children
     * @param contentEncoding
     * @param mimeTypesCount
     * @param totalCompressedSize
     * @param generateDIALCodes
     * @param contentType
     * @param trackable
     * @param identifier
     * @param audience
     * @param visibility
     * @param isExternal
     * @param contentTypesCount
     * @param consumerId
     * @param childNodes
     * @param discussionForum
     * @param publisherDetails
     * @param mediaType
     * @param osId
     * @param lastPublishedBy
     * @param version
     * @param prevState
     * @param license
     * @param size
     * @param lastPublishedOn
     * @param name
     * @param reviewStatus
     * @param creatorIDs
     * @param tocUrl
     * @param status
     * @param code
     * @param credentials
     * @param purpose
     * @param prevStatus
     * @param difficultyLevel
     * @param description
     * @param posterImage
     * @param idealScreenSize
     * @param createdOn
     * @param learningMode
     * @param duration
     * @param batches
     * @param contentDisposition
     * @param lastUpdatedOn
     * @param draftImage
     * @param seFWIds
     * @param dialcodeRequired
     * @param sysInternalLastUpdatedOn
     * @param creator
     * @param createdFor
     * @param lastStatusChangedOn
     * @param os
     * @param reviewer
     * @param pkgVersion
     * @param versionKey
     * @param reviewerIDs
     * @param idealScreenDensity
     * @param s3Key
     * @param depth
     * @param framework
     * @param lastSubmittedOn
     * @param competenciesV3
     * @param createdBy
     * @param leafNodesCount
     * @param compatibilityLevel
     * @param userConsent
     */
    public CourseData(List<String> ownershipType, String instructions, List<String> publisherIDs, String creatorContacts, String downloadUrl, String channel, List<String> organisation, List<String> language, Variants variants, String source, String mimeType, List<String> leafNodes, String objectType, String appIcon, String primaryCategory, List<Child> children, String contentEncoding, String mimeTypesCount, Float totalCompressedSize, String generateDIALCodes, String contentType, Trackable__2 trackable, String identifier, List<String> audience, String tocUrl, String visibility, Boolean isExternal, String contentTypesCount, String consumerId, List<String> childNodes, String discussionForum, String publisherDetails, String mediaType, String osId, String lastPublishedBy, Integer version, String prevState, String license, Float size, String lastPublishedOn, String name, String reviewStatus, List<String> creatorIDs, String status, String code, String competenciesV3, Credentials__2 credentials, String purpose, String prevStatus, String difficultyLevel, String description, String posterImage, String idealScreenSize, String createdOn, String learningMode, String duration, String contentDisposition, String lastUpdatedOn, String draftImage, String sysInternalLastUpdatedOn, String dialcodeRequired, String creator, List<String> createdFor, String lastStatusChangedOn, List<String> os, List<String> seFWIds, String reviewer, Float pkgVersion, String versionKey, List<String> reviewerIDs, String idealScreenDensity, String s3Key, Integer depth, String framework, String lastSubmittedOn, String createdBy, Integer leafNodesCount, Integer compatibilityLevel, String userConsent, List<Batch> batches) {
        super();
        this.ownershipType = ownershipType;
        this.instructions = instructions;
        this.publisherIDs = publisherIDs;
        this.creatorContacts = creatorContacts;
        this.downloadUrl = downloadUrl;
        this.channel = channel;
        this.organisation = organisation;
        this.language = language;
        this.variants = variants;
        this.source = source;
        this.mimeType = mimeType;
        this.leafNodes = leafNodes;
        this.objectType = objectType;
        this.appIcon = appIcon;
        this.primaryCategory = primaryCategory;
        this.children = children;
        this.contentEncoding = contentEncoding;
        this.mimeTypesCount = mimeTypesCount;
        this.totalCompressedSize = totalCompressedSize;
        this.generateDIALCodes = generateDIALCodes;
        this.contentType = contentType;
        this.trackable = trackable;
        this.identifier = identifier;
        this.audience = audience;
        this.tocUrl = tocUrl;
        this.visibility = visibility;
        this.isExternal = isExternal;
        this.contentTypesCount = contentTypesCount;
        this.consumerId = consumerId;
        this.childNodes = childNodes;
        this.discussionForum = discussionForum;
        this.publisherDetails = publisherDetails;
        this.mediaType = mediaType;
        this.osId = osId;
        this.lastPublishedBy = lastPublishedBy;
        this.version = version;
        this.prevState = prevState;
        this.license = license;
        this.size = size;
        this.lastPublishedOn = lastPublishedOn;
        this.name = name;
        this.reviewStatus = reviewStatus;
        this.creatorIDs = creatorIDs;
        this.status = status;
        this.code = code;
        this.competenciesV3 = competenciesV3;
        this.credentials = credentials;
        this.purpose = purpose;
        this.prevStatus = prevStatus;
        this.difficultyLevel = difficultyLevel;
        this.description = description;
        this.posterImage = posterImage;
        this.idealScreenSize = idealScreenSize;
        this.createdOn = createdOn;
        this.learningMode = learningMode;
        this.duration = duration;
        this.contentDisposition = contentDisposition;
        this.lastUpdatedOn = lastUpdatedOn;
        this.draftImage = draftImage;
        this.sysInternalLastUpdatedOn = sysInternalLastUpdatedOn;
        this.dialcodeRequired = dialcodeRequired;
        this.creator = creator;
        this.createdFor = createdFor;
        this.lastStatusChangedOn = lastStatusChangedOn;
        this.os = os;
        this.seFWIds = seFWIds;
        this.reviewer = reviewer;
        this.pkgVersion = pkgVersion;
        this.versionKey = versionKey;
        this.reviewerIDs = reviewerIDs;
        this.idealScreenDensity = idealScreenDensity;
        this.s3Key = s3Key;
        this.depth = depth;
        this.framework = framework;
        this.lastSubmittedOn = lastSubmittedOn;
        this.createdBy = createdBy;
        this.leafNodesCount = leafNodesCount;
        this.compatibilityLevel = compatibilityLevel;
        this.userConsent = userConsent;
        this.batches = batches;
    }

    @JsonProperty("ownershipType")
    public List<String> getOwnershipType() {
        return ownershipType;
    }

    @JsonProperty("ownershipType")
    public void setOwnershipType(List<String> ownershipType) {
        this.ownershipType = ownershipType;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("publisherIDs")
    public List<String> getPublisherIDs() {
        return publisherIDs;
    }

    @JsonProperty("publisherIDs")
    public void setPublisherIDs(List<String> publisherIDs) {
        this.publisherIDs = publisherIDs;
    }

    @JsonProperty("creatorContacts")
    public String getCreatorContacts() {
        return creatorContacts;
    }

    @JsonProperty("creatorContacts")
    public void setCreatorContacts(String creatorContacts) {
        this.creatorContacts = creatorContacts;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("organisation")
    public List<String> getOrganisation() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganisation(List<String> organisation) {
        this.organisation = organisation;
    }

    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @JsonProperty("variants")
    public Variants getVariants() {
        return variants;
    }

    @JsonProperty("variants")
    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("leafNodes")
    public List<String> getLeafNodes() {
        return leafNodes;
    }

    @JsonProperty("leafNodes")
    public void setLeafNodes(List<String> leafNodes) {
        this.leafNodes = leafNodes;
    }

    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("objectType")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("appIcon")
    public String getAppIcon() {
        return appIcon;
    }

    @JsonProperty("appIcon")
    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    @JsonProperty("primaryCategory")
    public String getPrimaryCategory() {
        return primaryCategory;
    }

    @JsonProperty("primaryCategory")
    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    @JsonProperty("children")
    public List<Child> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @JsonProperty("contentEncoding")
    public String getContentEncoding() {
        return contentEncoding;
    }

    @JsonProperty("contentEncoding")
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    @JsonProperty("mimeTypesCount")
    public String getMimeTypesCount() {
        return mimeTypesCount;
    }

    @JsonProperty("mimeTypesCount")
    public void setMimeTypesCount(String mimeTypesCount) {
        this.mimeTypesCount = mimeTypesCount;
    }

    @JsonProperty("totalCompressedSize")
    public Float getTotalCompressedSize() {
        return totalCompressedSize;
    }

    @JsonProperty("totalCompressedSize")
    public void setTotalCompressedSize(Float totalCompressedSize) {
        this.totalCompressedSize = totalCompressedSize;
    }

    @JsonProperty("generateDIALCodes")
    public String getGenerateDIALCodes() {
        return generateDIALCodes;
    }

    @JsonProperty("generateDIALCodes")
    public void setGenerateDIALCodes(String generateDIALCodes) {
        this.generateDIALCodes = generateDIALCodes;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("trackable")
    public Trackable__2 getTrackable() {
        return trackable;
    }

    @JsonProperty("trackable")
    public void setTrackable(Trackable__2 trackable) {
        this.trackable = trackable;
    }

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("audience")
    public List<String> getAudience() {
        return audience;
    }

    @JsonProperty("audience")
    public void setAudience(List<String> audience) {
        this.audience = audience;
    }

    @JsonProperty("toc_url")
    public String getTocUrl() {
        return tocUrl;
    }

    @JsonProperty("toc_url")
    public void setTocUrl(String tocUrl) {
        this.tocUrl = tocUrl;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("isExternal")
    public Boolean getIsExternal() {
        return isExternal;
    }

    @JsonProperty("isExternal")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    @JsonProperty("contentTypesCount")
    public String getContentTypesCount() {
        return contentTypesCount;
    }

    @JsonProperty("contentTypesCount")
    public void setContentTypesCount(String contentTypesCount) {
        this.contentTypesCount = contentTypesCount;
    }

    @JsonProperty("consumerId")
    public String getConsumerId() {
        return consumerId;
    }

    @JsonProperty("consumerId")
    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    @JsonProperty("childNodes")
    public List<String> getChildNodes() {
        return childNodes;
    }

    @JsonProperty("childNodes")
    public void setChildNodes(List<String> childNodes) {
        this.childNodes = childNodes;
    }

    @JsonProperty("discussionForum")
    public String getDiscussionForum() {
        return discussionForum;
    }

    @JsonProperty("discussionForum")
    public void setDiscussionForum(String discussionForum) {
        this.discussionForum = discussionForum;
    }

    @JsonProperty("publisherDetails")
    public String getPublisherDetails() {
        return publisherDetails;
    }

    @JsonProperty("publisherDetails")
    public void setPublisherDetails(String publisherDetails) {
        this.publisherDetails = publisherDetails;
    }

    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    @JsonProperty("mediaType")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @JsonProperty("osId")
    public String getOsId() {
        return osId;
    }

    @JsonProperty("osId")
    public void setOsId(String osId) {
        this.osId = osId;
    }

    @JsonProperty("lastPublishedBy")
    public String getLastPublishedBy() {
        return lastPublishedBy;
    }

    @JsonProperty("lastPublishedBy")
    public void setLastPublishedBy(String lastPublishedBy) {
        this.lastPublishedBy = lastPublishedBy;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("prevState")
    public String getPrevState() {
        return prevState;
    }

    @JsonProperty("prevState")
    public void setPrevState(String prevState) {
        this.prevState = prevState;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("size")
    public Float getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Float size) {
        this.size = size;
    }

    @JsonProperty("lastPublishedOn")
    public String getLastPublishedOn() {
        return lastPublishedOn;
    }

    @JsonProperty("lastPublishedOn")
    public void setLastPublishedOn(String lastPublishedOn) {
        this.lastPublishedOn = lastPublishedOn;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("reviewStatus")
    public String getReviewStatus() {
        return reviewStatus;
    }

    @JsonProperty("reviewStatus")
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @JsonProperty("creatorIDs")
    public List<String> getCreatorIDs() {
        return creatorIDs;
    }

    @JsonProperty("creatorIDs")
    public void setCreatorIDs(List<String> creatorIDs) {
        this.creatorIDs = creatorIDs;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("competencies_v3")
    public String getCompetenciesV3() {
        return competenciesV3;
    }

    @JsonProperty("competencies_v3")
    public void setCompetenciesV3(String competenciesV3) {
        this.competenciesV3 = competenciesV3;
    }

    @JsonProperty("credentials")
    public Credentials__2 getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials__2 credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("prevStatus")
    public String getPrevStatus() {
        return prevStatus;
    }

    @JsonProperty("prevStatus")
    public void setPrevStatus(String prevStatus) {
        this.prevStatus = prevStatus;
    }

    @JsonProperty("difficultyLevel")
    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    @JsonProperty("difficultyLevel")
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("posterImage")
    public String getPosterImage() {
        return posterImage;
    }

    @JsonProperty("posterImage")
    public void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }

    @JsonProperty("idealScreenSize")
    public String getIdealScreenSize() {
        return idealScreenSize;
    }

    @JsonProperty("idealScreenSize")
    public void setIdealScreenSize(String idealScreenSize) {
        this.idealScreenSize = idealScreenSize;
    }

    @JsonProperty("createdOn")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("createdOn")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("learningMode")
    public String getLearningMode() {
        return learningMode;
    }

    @JsonProperty("learningMode")
    public void setLearningMode(String learningMode) {
        this.learningMode = learningMode;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("contentDisposition")
    public String getContentDisposition() {
        return contentDisposition;
    }

    @JsonProperty("contentDisposition")
    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    @JsonProperty("lastUpdatedOn")
    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    @JsonProperty("lastUpdatedOn")
    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @JsonProperty("draftImage")
    public String getDraftImage() {
        return draftImage;
    }

    @JsonProperty("draftImage")
    public void setDraftImage(String draftImage) {
        this.draftImage = draftImage;
    }

    @JsonProperty("SYS_INTERNAL_LAST_UPDATED_ON")
    public String getSysInternalLastUpdatedOn() {
        return sysInternalLastUpdatedOn;
    }

    @JsonProperty("SYS_INTERNAL_LAST_UPDATED_ON")
    public void setSysInternalLastUpdatedOn(String sysInternalLastUpdatedOn) {
        this.sysInternalLastUpdatedOn = sysInternalLastUpdatedOn;
    }

    @JsonProperty("dialcodeRequired")
    public String getDialcodeRequired() {
        return dialcodeRequired;
    }

    @JsonProperty("dialcodeRequired")
    public void setDialcodeRequired(String dialcodeRequired) {
        this.dialcodeRequired = dialcodeRequired;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("createdFor")
    public List<String> getCreatedFor() {
        return createdFor;
    }

    @JsonProperty("createdFor")
    public void setCreatedFor(List<String> createdFor) {
        this.createdFor = createdFor;
    }

    @JsonProperty("lastStatusChangedOn")
    public String getLastStatusChangedOn() {
        return lastStatusChangedOn;
    }

    @JsonProperty("lastStatusChangedOn")
    public void setLastStatusChangedOn(String lastStatusChangedOn) {
        this.lastStatusChangedOn = lastStatusChangedOn;
    }

    @JsonProperty("os")
    public List<String> getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(List<String> os) {
        this.os = os;
    }

    @JsonProperty("se_FWIds")
    public List<String> getSeFWIds() {
        return seFWIds;
    }

    @JsonProperty("se_FWIds")
    public void setSeFWIds(List<String> seFWIds) {
        this.seFWIds = seFWIds;
    }

    @JsonProperty("reviewer")
    public String getReviewer() {
        return reviewer;
    }

    @JsonProperty("reviewer")
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @JsonProperty("pkgVersion")
    public Float getPkgVersion() {
        return pkgVersion;
    }

    @JsonProperty("pkgVersion")
    public void setPkgVersion(Float pkgVersion) {
        this.pkgVersion = pkgVersion;
    }

    @JsonProperty("versionKey")
    public String getVersionKey() {
        return versionKey;
    }

    @JsonProperty("versionKey")
    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey;
    }

    @JsonProperty("reviewerIDs")
    public List<String> getReviewerIDs() {
        return reviewerIDs;
    }

    @JsonProperty("reviewerIDs")
    public void setReviewerIDs(List<String> reviewerIDs) {
        this.reviewerIDs = reviewerIDs;
    }

    @JsonProperty("idealScreenDensity")
    public String getIdealScreenDensity() {
        return idealScreenDensity;
    }

    @JsonProperty("idealScreenDensity")
    public void setIdealScreenDensity(String idealScreenDensity) {
        this.idealScreenDensity = idealScreenDensity;
    }

    @JsonProperty("s3Key")
    public String getS3Key() {
        return s3Key;
    }

    @JsonProperty("s3Key")
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    @JsonProperty("depth")
    public Integer getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @JsonProperty("framework")
    public String getFramework() {
        return framework;
    }

    @JsonProperty("framework")
    public void setFramework(String framework) {
        this.framework = framework;
    }

    @JsonProperty("lastSubmittedOn")
    public String getLastSubmittedOn() {
        return lastSubmittedOn;
    }

    @JsonProperty("lastSubmittedOn")
    public void setLastSubmittedOn(String lastSubmittedOn) {
        this.lastSubmittedOn = lastSubmittedOn;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("leafNodesCount")
    public Integer getLeafNodesCount() {
        return leafNodesCount;
    }

    @JsonProperty("leafNodesCount")
    public void setLeafNodesCount(Integer leafNodesCount) {
        this.leafNodesCount = leafNodesCount;
    }

    @JsonProperty("compatibilityLevel")
    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    @JsonProperty("compatibilityLevel")
    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    @JsonProperty("userConsent")
    public String getUserConsent() {
        return userConsent;
    }

    @JsonProperty("userConsent")
    public void setUserConsent(String userConsent) {
        this.userConsent = userConsent;
    }

    @JsonProperty("batches")
    public List<Batch> getBatches() {
        return batches;
    }

    @JsonProperty("batches")
    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }

}
