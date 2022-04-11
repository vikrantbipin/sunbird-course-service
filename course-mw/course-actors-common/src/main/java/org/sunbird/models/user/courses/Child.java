
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
    "code",
    "purpose",
    "credentials",
    "channel",
    "organisation",
    "description",
    "language",
    "mimeType",
    "idealScreenSize",
    "createdOn",
    "objectType",
    "primaryCategory",
    "children",
    "contentDisposition",
    "lastUpdatedOn",
    "contentEncoding",
    "generateDIALCodes",
    "contentType",
    "dialcodeRequired",
    "trackable",
    "identifier",
    "lastStatusChangedOn",
    "createdFor",
    "audience",
    "creator",
    "os",
    "isExternal",
    "visibility",
    "discussionForum",
    "index",
    "mediaType",
    "osId",
    "languageCode",
    "version",
    "versionKey",
    "license",
    "idealScreenDensity",
    "framework",
    "depth",
    "createdBy",
    "compatibilityLevel",
    "name",
    "status"
})
@Generated("jsonschema2pojo")
public class Child {

    @JsonProperty("ownershipType")
    private List<String> ownershipType = null;
    @JsonProperty("parent")
    private String parent;
    @JsonProperty("code")
    private String code;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("credentials")
    private Credentials credentials;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("organisation")
    private List<String> organisation = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("language")
    private List<String> language = null;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("idealScreenSize")
    private String idealScreenSize;
    @JsonProperty("createdOn")
    private String createdOn;
    @JsonProperty("objectType")
    private String objectType;
    @JsonProperty("primaryCategory")
    private String primaryCategory;
    @JsonProperty("children")
    private List<Child__1> children = null;
    @JsonProperty("contentDisposition")
    private String contentDisposition;
    @JsonProperty("lastUpdatedOn")
    private String lastUpdatedOn;
    @JsonProperty("contentEncoding")
    private String contentEncoding;
    @JsonProperty("generateDIALCodes")
    private String generateDIALCodes;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("dialcodeRequired")
    private String dialcodeRequired;
    @JsonProperty("trackable")
    private Trackable__1 trackable;
    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("lastStatusChangedOn")
    private String lastStatusChangedOn;
    @JsonProperty("createdFor")
    private List<String> createdFor = null;
    @JsonProperty("audience")
    private List<String> audience = null;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("os")
    private List<String> os = null;
    @JsonProperty("isExternal")
    private Boolean isExternal;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("discussionForum")
    private DiscussionForum__1 discussionForum;
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
    @JsonProperty("versionKey")
    private String versionKey;
    @JsonProperty("license")
    private String license;
    @JsonProperty("idealScreenDensity")
    private String idealScreenDensity;
    @JsonProperty("framework")
    private String framework;
    @JsonProperty("depth")
    private Integer depth;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("compatibilityLevel")
    private Integer compatibilityLevel;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Child() {
    }

    /**
     * 
     * @param ownershipType
     * @param parent
     * @param code
     * @param purpose
     * @param credentials
     * @param channel
     * @param organisation
     * @param description
     * @param language
     * @param mimeType
     * @param idealScreenSize
     * @param createdOn
     * @param objectType
     * @param primaryCategory
     * @param children
     * @param contentDisposition
     * @param lastUpdatedOn
     * @param contentEncoding
     * @param generateDIALCodes
     * @param contentType
     * @param dialcodeRequired
     * @param trackable
     * @param identifier
     * @param lastStatusChangedOn
     * @param createdFor
     * @param audience
     * @param creator
     * @param os
     * @param isExternal
     * @param visibility
     * @param discussionForum
     * @param index
     * @param mediaType
     * @param osId
     * @param languageCode
     * @param version
     * @param versionKey
     * @param license
     * @param idealScreenDensity
     * @param framework
     * @param depth
     * @param createdBy
     * @param compatibilityLevel
     * @param name
     * @param status
     */
    public Child(List<String> ownershipType, String parent, String code, String purpose, Credentials credentials, String channel, List<String> organisation, String description, List<String> language, String mimeType, String idealScreenSize, String createdOn, String objectType, String primaryCategory, List<Child__1> children, String contentDisposition, String lastUpdatedOn, String contentEncoding, String generateDIALCodes, String contentType, String dialcodeRequired, Trackable__1 trackable, String identifier, String lastStatusChangedOn, List<String> createdFor, List<String> audience, String creator, List<String> os, Boolean isExternal, String visibility, DiscussionForum__1 discussionForum, Integer index, String mediaType, String osId, List<String> languageCode, Integer version, String versionKey, String license, String idealScreenDensity, String framework, Integer depth, String createdBy, Integer compatibilityLevel, String name, String status) {
        super();
        this.ownershipType = ownershipType;
        this.parent = parent;
        this.code = code;
        this.purpose = purpose;
        this.credentials = credentials;
        this.channel = channel;
        this.organisation = organisation;
        this.description = description;
        this.language = language;
        this.mimeType = mimeType;
        this.idealScreenSize = idealScreenSize;
        this.createdOn = createdOn;
        this.objectType = objectType;
        this.primaryCategory = primaryCategory;
        this.children = children;
        this.contentDisposition = contentDisposition;
        this.lastUpdatedOn = lastUpdatedOn;
        this.contentEncoding = contentEncoding;
        this.generateDIALCodes = generateDIALCodes;
        this.contentType = contentType;
        this.dialcodeRequired = dialcodeRequired;
        this.trackable = trackable;
        this.identifier = identifier;
        this.lastStatusChangedOn = lastStatusChangedOn;
        this.createdFor = createdFor;
        this.audience = audience;
        this.creator = creator;
        this.os = os;
        this.isExternal = isExternal;
        this.visibility = visibility;
        this.discussionForum = discussionForum;
        this.index = index;
        this.mediaType = mediaType;
        this.osId = osId;
        this.languageCode = languageCode;
        this.version = version;
        this.versionKey = versionKey;
        this.license = license;
        this.idealScreenDensity = idealScreenDensity;
        this.framework = framework;
        this.depth = depth;
        this.createdBy = createdBy;
        this.compatibilityLevel = compatibilityLevel;
        this.name = name;
        this.status = status;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
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
    public Credentials getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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

    @JsonProperty("children")
    public List<Child__1> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Child__1> children) {
        this.children = children;
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

    @JsonProperty("contentEncoding")
    public String getContentEncoding() {
        return contentEncoding;
    }

    @JsonProperty("contentEncoding")
    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
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

    @JsonProperty("dialcodeRequired")
    public String getDialcodeRequired() {
        return dialcodeRequired;
    }

    @JsonProperty("dialcodeRequired")
    public void setDialcodeRequired(String dialcodeRequired) {
        this.dialcodeRequired = dialcodeRequired;
    }

    @JsonProperty("trackable")
    public Trackable__1 getTrackable() {
        return trackable;
    }

    @JsonProperty("trackable")
    public void setTrackable(Trackable__1 trackable) {
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

    @JsonProperty("audience")
    public List<String> getAudience() {
        return audience;
    }

    @JsonProperty("audience")
    public void setAudience(List<String> audience) {
        this.audience = audience;
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

    @JsonProperty("discussionForum")
    public DiscussionForum__1 getDiscussionForum() {
        return discussionForum;
    }

    @JsonProperty("discussionForum")
    public void setDiscussionForum(DiscussionForum__1 discussionForum) {
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

    @JsonProperty("versionKey")
    public String getVersionKey() {
        return versionKey;
    }

    @JsonProperty("versionKey")
    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}
