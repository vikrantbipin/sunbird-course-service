
package org.sunbird.models.user.courses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled",
    "autoBatch"
})
@Generated("jsonschema2pojo")
public class Trackable {

    @JsonProperty("enabled")
    private String enabled;
    @JsonProperty("autoBatch")
    private String autoBatch;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Trackable() {
    }

    /**
     * 
     * @param enabled
     * @param autoBatch
     */
    public Trackable(String enabled, String autoBatch) {
        super();
        this.enabled = enabled;
        this.autoBatch = autoBatch;
    }

    @JsonProperty("enabled")
    public String getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("autoBatch")
    public String getAutoBatch() {
        return autoBatch;
    }

    @JsonProperty("autoBatch")
    public void setAutoBatch(String autoBatch) {
        this.autoBatch = autoBatch;
    }

}
