
package org.sunbird.models.user.courses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ecarUrl",
    "size"
})
@Generated("jsonschema2pojo")
public class Online {

    @JsonProperty("ecarUrl")
    private String ecarUrl;
    @JsonProperty("size")
    private Float size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Online() {
    }

    /**
     * 
     * @param ecarUrl
     * @param size
     */
    public Online(String ecarUrl, Float size) {
        super();
        this.ecarUrl = ecarUrl;
        this.size = size;
    }

    @JsonProperty("ecarUrl")
    public String getEcarUrl() {
        return ecarUrl;
    }

    @JsonProperty("ecarUrl")
    public void setEcarUrl(String ecarUrl) {
        this.ecarUrl = ecarUrl;
    }

    @JsonProperty("size")
    public Float getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Float size) {
        this.size = size;
    }

}
