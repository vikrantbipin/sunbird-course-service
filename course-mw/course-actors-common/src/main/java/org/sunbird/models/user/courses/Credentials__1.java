
package org.sunbird.models.user.courses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled"
})
@Generated("jsonschema2pojo")
public class Credentials__1 {

    @JsonProperty("enabled")
    private String enabled;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Credentials__1() {
    }

    /**
     * 
     * @param enabled
     */
    public Credentials__1(String enabled) {
        super();
        this.enabled = enabled;
    }

    @JsonProperty("enabled")
    public String getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

}
