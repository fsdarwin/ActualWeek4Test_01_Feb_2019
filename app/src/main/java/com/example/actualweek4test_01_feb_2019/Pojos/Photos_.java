
package com.example.actualweek4test_01_feb_2019.Pojos;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photos_ implements Parcelable
{

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("perpage")
    @Expose
    private Integer perpage;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("photo")
    @Expose
    private List<Photo> photo = null;
    public final static Creator<Photos_> CREATOR = new Creator<Photos_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Photos_ createFromParcel(Parcel in) {
            return new Photos_(in);
        }

        public Photos_[] newArray(int size) {
            return (new Photos_[size]);
        }

    }
    ;

    protected Photos_(Parcel in) {
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pages = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.perpage = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.photo, (com.example.actualweek4test_01_feb_2019.Pojos.Photo.class.getClassLoader()));
    }

    public Photos_() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPerpage() {
        return perpage;
    }

    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(page);
        dest.writeValue(pages);
        dest.writeValue(perpage);
        dest.writeValue(total);
        dest.writeList(photo);
    }

    public int describeContents() {
        return  0;
    }

}
