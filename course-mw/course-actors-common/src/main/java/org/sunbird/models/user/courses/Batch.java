
package org.sunbird.models.user.courses;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createdFor",
    "endDate",
    "name",
    "batchId",
    "enrollmentType",
    "enrollmentEndDate",
    "startDate",
    "status"
})
@Generated("jsonschema2pojo")
public class Batch {

    @JsonProperty("createdFor")
    private List<Object> createdFor = null;
    @JsonProperty("endDate")
    private Object endDate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("batchId")
    private String batchId;
    @JsonProperty("enrollmentType")
    private String enrollmentType;
    @JsonProperty("enrollmentEndDate")
    private Object enrollmentEndDate;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("status")
    private Integer status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Batch() {
    }

    /**
     * 
     * @param createdFor
     * @param endDate
     * @param name
     * @param batchId
     * @param enrollmentType
     * @param enrollmentEndDate
     * @param startDate
     * @param status
     */
    public Batch(List<Object> createdFor, Object endDate, String name, String batchId, String enrollmentType, Object enrollmentEndDate, String startDate, Integer status) {
        super();
        this.createdFor = createdFor;
        this.endDate = endDate;
        this.name = name;
        this.batchId = batchId;
        this.enrollmentType = enrollmentType;
        this.enrollmentEndDate = enrollmentEndDate;
        this.startDate = startDate;
        this.status = status;
    }

    @JsonProperty("createdFor")
    public List<Object> getCreatedFor() {
        return createdFor;
    }

    @JsonProperty("createdFor")
    public void setCreatedFor(List<Object> createdFor) {
        this.createdFor = createdFor;
    }

    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("batchId")
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty("batchId")
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @JsonProperty("enrollmentType")
    public String getEnrollmentType() {
        return enrollmentType;
    }

    @JsonProperty("enrollmentType")
    public void setEnrollmentType(String enrollmentType) {
        this.enrollmentType = enrollmentType;
    }

    @JsonProperty("enrollmentEndDate")
    public Object getEnrollmentEndDate() {
        return enrollmentEndDate;
    }

    @JsonProperty("enrollmentEndDate")
    public void setEnrollmentEndDate(Object enrollmentEndDate) {
        this.enrollmentEndDate = enrollmentEndDate;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

}
