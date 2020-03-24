
package org.jivesoftware;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FCMModel {

    @SerializedName("data")
    private Data mData;
    @SerializedName("notification")
    private Notification mNotification;
    @SerializedName("to")
    private String mTo;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Notification getNotification() {
        return mNotification;
    }

    public void setNotification(Notification notification) {
        mNotification = notification;
    }

    public String getTo() {
        return mTo;
    }

    public void setTo(String to) {
        mTo = to;
    }

}
