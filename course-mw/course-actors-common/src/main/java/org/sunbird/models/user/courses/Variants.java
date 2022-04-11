
package org.sunbird.models.user.courses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "online",
    "spine"
})
@Generated("jsonschema2pojo")
public class Variants {

    @JsonProperty("online")
    private Online online;
    @JsonProperty("spine")
    private Spine spine;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variants() {
    }

    /**
     * 
     * @param online
     * @param spine
     */
    public Variants(Online online, Spine spine) {
        super();
        this.online = online;
        this.spine = spine;
    }

    @JsonProperty("online")
    public Online getOnline() {
        return online;
    }

    @JsonProperty("online")
    public void setOnline(Online online) {
        this.online = online;
    }

    @JsonProperty("spine")
    public Spine getSpine() {
        return spine;
    }

    @JsonProperty("spine")
    public void setSpine(Spine spine) {
        this.spine = spine;
    }

}
