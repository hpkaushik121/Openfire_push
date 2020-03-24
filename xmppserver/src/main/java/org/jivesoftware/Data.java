
package org.jivesoftware;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("from_JID")
    private String from;

    @SerializedName("message")
    private String message;

    @SerializedName("stanzaId")
    private String stanzaID;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStanzaID() {
        return stanzaID;
    }

    public void setStanzaID(String stanzaID) {
        this.stanzaID = stanzaID;
    }
}
