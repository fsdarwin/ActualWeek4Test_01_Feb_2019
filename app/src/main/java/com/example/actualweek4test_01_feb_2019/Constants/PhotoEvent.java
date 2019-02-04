package com.example.actualweek4test_01_feb_2019.Constants;

import com.example.actualweek4test_01_feb_2019.Pojos.Photo;

import java.util.ArrayList;

public class PhotoEvent {
    private ArrayList<Photo> photoArray;

    public PhotoEvent(ArrayList<Photo> photoArray) {
        this.photoArray = photoArray;
    }

    public ArrayList<Photo> getPhotoArray() {
        return photoArray;
    }
}