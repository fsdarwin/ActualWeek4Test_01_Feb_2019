package com.example.actualweek4test_01_feb_2019.activities;

import com.example.actualweek4test_01_feb_2019.helpers.OkHttp3Helper;

import static com.example.actualweek4test_01_feb_2019.Constants.Constants.PHOTO_URL1;
import static com.example.actualweek4test_01_feb_2019.Constants.Constants.PHOTO_URL2;

public class MainActivityPresenter {

    public MainActivityPresenter(String searchString) {
        makeOkHttp3Call(searchString);
    }

    public void makeOkHttp3Call(String searchString) {
        OkHttp3Helper.asyncOkHttpApiCall(PHOTO_URL1 + searchString + PHOTO_URL2);
    }
}
