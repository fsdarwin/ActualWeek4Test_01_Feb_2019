
package com.example.actualweek4test_01_feb_2019.Pojos;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private String farm;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ispublic")
    @Expose
    private String ispublic;
    @SerializedName("isfriend")
    @Expose
    private String isfriend;
    @SerializedName("isfamily")
    @Expose
    private String isfamily;
    public final static Creator<Photo> CREATOR = new Creator<Photo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        public Photo[] newArray(int size) {
            return (new Photo[size]);
        }

    }
    ;

    protected Photo(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.owner = ((String) in.readValue((String.class.getClassLoader())));
        this.secret = ((String) in.readValue((String.class.getClassLoader())));
        this.server = ((String) in.readValue((String.class.getClassLoader())));
        this.farm = ((String) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.ispublic = ((String) in.readValue((Integer.class.getClassLoader())));
        this.isfriend = ((String) in.readValue((Integer.class.getClassLoader())));
        this.isfamily = ((String) in.readValue((Integer.class.getClassLoader())));
    }

    public Photo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(String isfriend) {
        this.isfriend = isfriend;
    }

    public String getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(String isfamily) {
        this.isfamily = isfamily;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(owner);
        dest.writeValue(secret);
        dest.writeValue(server);
        dest.writeValue(farm);
        dest.writeValue(title);
        dest.writeValue(ispublic);
        dest.writeValue(isfriend);
        dest.writeValue(isfamily);
    }

    public int describeContents() {
        return  0;
    }

}
