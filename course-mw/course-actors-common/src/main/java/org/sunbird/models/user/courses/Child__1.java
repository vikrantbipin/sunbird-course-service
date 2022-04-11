
package org.sunbird.models.user.courses;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ownershipType",
    "parent",
    "instructions",
    "creatorContacts",
    "channel",
    "downloadUrl",
    "organisation",
    "language",
    "source",
    "mimeType",
    "objectType",
    "primaryCategory",
    "contentEncoding",
    "artifactUrl",
    "contentType",
    "trackable",
    "identifier",
    "audience",
    "isExternal",
    "visibility",
    "consumerId",
    "discussionForum",
    "index",
    "mediaType",
    "osId",
    "languageCode",
    "version",
    "license",
    "size",
    "name",
    "creatorIDs",
    "reviewStatus",
    "status",
    "code",
    "interceptionPoints",
    "purpose",
    "credentials",
    "description",
    "idealScreenSize",
    "createdOn",
    "duration",
    "contentDisposition",
    "lastUpdatedOn",
    "dialcodeRequired",
    "lastStatusChangedOn",
    "createdFor",
    "creator",
    "os",
    "cloudStorageKey",
    "versionKey",
    "idealScreenDensity",
    "framework",
    "depth",
    "s3Key",
    "lastSubmittedOn",
    "createdBy",
    "compatibilityLevel"
})
@Generated("jsonschema2pojo")
public class Child__1 {

    @JsonProperty("ownershipType")
    private List<String> ownershipType = null;
    @JsonProperty("parent")
    private String parent;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("creatorContacts")
    private String creatorContacts;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("organisation")
    private List<String> organisation = null;
    @JsonProperty("language")
    private List<String> language = null;
    @JsonProperty("source")
    private String source;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("objectType")
    private String objectType;
    @JsonProperty("primaryCategory")
    private String primaryCategory;
    @JsonProperty("contentEncoding")
    private String contentEncoding;
    @JsonProperty("artifactUrl")
    private String artifactUrl;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("trackable")
    private Trackable trackable;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("audience")
    private List<String> audience = null;
    @JsonProperty("isExternal")
    private Boolean isExternal;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("consumerId")
    private String consumerId;
    @JsonProperty("discussionForum")
    private DiscussionForum discussionForum;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("osId")
    private String osId;
    @JsonProperty("languageCode")
    private List<String> languageCode = null;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("license")
    private String license;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("name")
    private String name;
    @JsonProperty("creatorIDs")
    private List<String> creatorIDs = null;
    @JsonProperty("reviewStatus")
    private String reviewStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("code")
    private String code;
    @JsonProperty("interceptionPoints")
    private InterceptionPoints interceptionPoints;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("credentials")
    private Credentials__1 credentials;
    @JsonProperty("description")
    private String description;
    @JsonProperty("idealScreenSize")
    private String idealScreenSize;
    @JsonProperty("createdOn")
    private String createdOn;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("contentDisposition")
    private String contentDisposition;
    @JsonProperty("lastUpdatedOn")
    private String lastUpdatedOn;
    @JsonProperty("dialcodeRequired")
    private String dialcodeRequired;
    @JsonProperty("lastStatusChangedOn")
    private String lastStatusChangedOn;
    @JsonProperty("createdFor")
    private List<String> createdFor = null;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("os")
    private List<String> os = null;
    @JsonProperty("cloudStorageKey")
    private String cloudStorageKey;
    @JsonProperty("versionKey")
    private String versionKey;
    @JsonProperty("idealScreenDensity")
    private String idealScreenDensity;
    @JsonProperty("framework")
    private String framework;
    @JsonProperty("depth")
    private Integer depth;
    @JsonProperty("s3Key")
    private String s3Key;
    @JsonProperty("lastSubmittedOn")
    private String lastSubmittedOn;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("compatibilityLevel")
    private Integer compatibilityLevel;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Child__1() {
    }

    /**
     * 
     * @param ownershipType
     * @param parent
     * @param instructions
     * @param creatorContacts
     * @param channel
     * @param downloadUrl
     * @param organisation
     * @param language
     * @param source
     * @param mimeType
     * @param objectType
     * @param primaryCategory
     * @param contentEncoding
     * @param artifactUrl
     * @param contentType
     * @param trackable
     * @param identifier
     * @param audience
     * @param isExternal
     * @param visibility
     * @param consumerId
     * @param discussionForum
     * @param index
     * @param mediaType
     * @param osId
     * @param languageCode
     * @param version
     * @param license
     * @param size
     * @param name
     * @param creatorIDs
     * @param reviewStatus
     * @param status
     * @param code
     * @param interceptionPoints
     * @param purpose
     * @param credentials
     * @param description
     * @param idealScreenSize
     * @param createdOn
     * @param duration
     * @param contentDisposition
     * @param lastUpdatedOn
     * @param dialcodeRequired
     * @param lastStatusChangedOn
     * @param createdFor
     * @param creator
     * @param os
     * @param cloudStorageKey
     * @param versionKey
     * @param idealScreenDensity
     * @param framework
     * @param depth
     * @param s3Key
     * @param lastSubmittedOn
     * @param createdBy
     * @param compatibilityLevel
     */
    public Child__1(List<String> ownershipType, String parent, String instructions, String creatorContacts, String channel, String downloadUrl, List<String> organisation, List<String> language, String source, String mimeType, String objectType, String primaryCategory, String contentEncoding, String artifactUrl, String contentType, Trackable trackable, String identifier, List<String> audience, Boolean isExternal, String visibility, String consumerId, DiscussionForum discussionForum, Integer index, String mediaType, String osId, List<String> languageCode, Integer version, String license, Integer size, String name, List<String> creatorIDs, String reviewStatus, String status, String code, InterceptionPoints interceptionPoints, String purpose, Credentials__1 credentials, String description, String idealScreenSize, String createdOn, String duration, String contentDisposition, String lastUpdatedOn, String dialcodeRequired, String lastStatusChangedOn, List<String> createdFor, String creator, List<String> os, String cloudStorageKey, String versionKey, String idealScreenDensity, String framework, Integer depth, String s3Key, String lastSubmittedOn, String createdBy, Integer compatibilityLevel) {
        super();
        this.ownershipType = ownershipType;
        this.parent = parent;
        this.instructions = instructions;
        this.creatorContacts = creatorContacts;
        this.channel = channel;
        this.downloadUrl = downloadUrl;
        this.organisation = organisation;
        this.language = language;
        this.source = source;
        this.mimeType = mimeType;
        this.objectType = objectType;
        this.primaryCategory = primaryCategory;
        this.contentEncoding = contentEncoding;
        this.artifactUrl = artifactUrl;
        this.contentType = contentType;
        this.trackable = trackable;
        this.identifier = identifier;
        this.audience = audience;
        this.isExternal = isExternal;
        this.visibility = visibility;
        this.consumerId = consumerId;
        this.discussionForum = discussionForum;
        this.index = index;
        this.mediaType = mediaType;
        this.osId = osId;
        this.languageCode = languageCode;
        this.version = version;
        this.license = license;
        this.size = size;
        this.name = name;
        this.creatorIDs = creatorIDs;
        this.reviewStatus = reviewStatus;
        this.status = status;
        this.code = code;
        this.interceptionPoints = interceptionPoints;
        this.purpose = purpose;
        this.credentials = credentials;
        this.description = description;
        this.idealScreenSize = idealScreenSize;
        this.createdOn = createdOn;
        this.duration = duration;
        this.contentDisposition = contentDisposition;
        this.lastUpdatedOn = lastUpdatedOn;
        this.dialcodeRequired = dialcodeRequired;
        this.lastStatusChangedOn = lastStatusChangedOn;
        this.createdFor = createdFor;
        this.creator = creator;
        this.os = os;
        this.cloudStorageKey = cloudStorageKey;
        this.versionKey = versionKey;
        this.idealScreenDensity = idealScreenDensity;
        this.framework = framework;
        this.depth = depth;
        this.s3Key = s3Key;
        this.lastSubmittedOn = lastSubmittedOn;
        this.createdBy = createdBy;
        this.compatibilityLevel = compatibilityLevel;
    }

    @JsonProperty("ownershipType")
    public List<String> getOwnershipType() {
        return ownershipType;
    }

    @JsonProperty("ownershipType")
    public void setOwnershipType(List<String> ownershipType) {
        this.ownershipType = ownershipType;
    }

    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("creatorContacts")
    public String getCreatorContacts() {
        return creatorContacts;
    }

    @JsonProperty("creatorContacts")
    public void setCreatorContacts(String creatorContacts) {
        this.creatorContacts = creatorContacts;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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

    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("objectType")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("primaryCategory")
    public String getPrimaryCategory() {
        return primaryCategory;
    }

    @JsonProperty("primaryCategory")
    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    @JsonProperty("contentEncoding")
    public String getContentEncoding() {
        return contentEncoding;
    }

    @JsonProperty("contentEncoding")
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    @JsonProperty("artifactUrl")
    public String getArtifactUrl() {
        return artifactUrl;
    }

    @JsonProperty("artifactUrl")
    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
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
    public Trackable getTrackable() {
        return trackable;
    }

    @JsonProperty("trackable")
    public void setTrackable(Trackable trackable) {
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

    @JsonProperty("isExternal")
    public Boolean getIsExternal() {
        return isExternal;
    }

    @JsonProperty("isExternal")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("consumerId")
    public String getConsumerId() {
        return consumerId;
    }

    @JsonProperty("consumerId")
    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    @JsonProperty("discussionForum")
    public DiscussionForum getDiscussionForum() {
        return discussionForum;
    }

    @JsonProperty("discussionForum")
    public void setDiscussionForum(DiscussionForum discussionForum) {
        this.discussionForum = discussionForum;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
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

    @JsonProperty("languageCode")
    public List<String> getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(List<String> languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
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
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("creatorIDs")
    public List<String> getCreatorIDs() {
        return creatorIDs;
    }

    @JsonProperty("creatorIDs")
    public void setCreatorIDs(List<String> creatorIDs) {
        this.creatorIDs = creatorIDs;
    }

    @JsonProperty("reviewStatus")
    public String getReviewStatus() {
        return reviewStatus;
    }

    @JsonProperty("reviewStatus")
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
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

    @JsonProperty("interceptionPoints")
    public InterceptionPoints getInterceptionPoints() {
        return interceptionPoints;
    }

    @JsonProperty("interceptionPoints")
    public void setInterceptionPoints(InterceptionPoints interceptionPoints) {
        this.interceptionPoints = interceptionPoints;
    }

    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("credentials")
    public Credentials__1 getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials__1 credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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

    @JsonProperty("dialcodeRequired")
    public String getDialcodeRequired() {
        return dialcodeRequired;
    }

    @JsonProperty("dialcodeRequired")
    public void setDialcodeRequired(String dialcodeRequired) {
        this.dialcodeRequired = dialcodeRequired;
    }

    @JsonProperty("lastStatusChangedOn")
    public String getLastStatusChangedOn() {
        return lastStatusChangedOn;
    }

    @JsonProperty("lastStatusChangedOn")
    public void setLastStatusChangedOn(String lastStatusChangedOn) {
        this.lastStatusChangedOn = lastStatusChangedOn;
    }

    @JsonProperty("createdFor")
    public List<String> getCreatedFor() {
        return createdFor;
    }

    @JsonProperty("createdFor")
    public void setCreatedFor(List<String> createdFor) {
        this.createdFor = createdFor;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("os")
    public List<String> getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(List<String> os) {
        this.os = os;
    }

    @JsonProperty("cloudStorageKey")
    public String getCloudStorageKey() {
        return cloudStorageKey;
    }

    @JsonProperty("cloudStorageKey")
    public void setCloudStorageKey(String cloudStorageKey) {
        this.cloudStorageKey = cloudStorageKey;
    }

    @JsonProperty("versionKey")
    public String getVersionKey() {
        return versionKey;
    }

    @JsonProperty("versionKey")
    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey;
    }

    @JsonProperty("idealScreenDensity")
    public String getIdealScreenDensity() {
        return idealScreenDensity;
    }

    @JsonProperty("idealScreenDensity")
    public void setIdealScreenDensity(String idealScreenDensity) {
        this.idealScreenDensity = idealScreenDensity;
    }

    @JsonProperty("framework")
    public String getFramework() {
        return framework;
    }

    @JsonProperty("framework")
    public void setFramework(String framework) {
        this.framework = framework;
    }

    @JsonProperty("depth")
    public Integer getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @JsonProperty("s3Key")
    public String getS3Key() {
        return s3Key;
    }

    @JsonProperty("s3Key")
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
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

    @JsonProperty("compatibilityLevel")
    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    @JsonProperty("compatibilityLevel")
    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

}
