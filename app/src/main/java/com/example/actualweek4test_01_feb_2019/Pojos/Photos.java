
package com.example.actualweek4test_01_feb_2019.Pojos;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photos implements Parcelable
{

    @SerializedName("photos")
    @Expose
    private Photos_ photos;
    @SerializedName("stat")
    @Expose
    private String stat;
    public final static Creator<Photos> CREATOR = new Creator<Photos>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Photos createFromParcel(Parcel in) {
            return new Photos(in);
        }

        public Photos[] newArray(int size) {
            return (new Photos[size]);
        }

    }
    ;

    public Photos(Parcel in) {
        this.photos = ((Photos_) in.readValue((Photos_.class.getClassLoader())));
        this.stat = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Photos() {
    }

    public Photos_ getPhotos() {
        return photos;
    }

    public void setPhotos(Photos_ photos) {
        this.photos = photos;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(photos);
        dest.writeValue(stat);
    }

    public int describeContents() {
        return  0;
    }

}
