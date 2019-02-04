package com.example.actualweek4test_01_feb_2019.helpers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.actualweek4test_01_feb_2019.Pojos.Photo;
import com.example.actualweek4test_01_feb_2019.Pojos.Photos;
import com.example.actualweek4test_01_feb_2019.Pojos.Photos_;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp3Helper {

    public static final String TAG = "FRANK: ";
    //ArrayList<Photos_> photoArrayList;

    public static void asyncOkHttpApiCall(String url) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            String jsonResponse;

            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: ", e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    jsonResponse = response.body().string();
                    Gson gson = new Gson();
                    Photos photos;
                    gson = new Gson();
                    photos = gson.fromJson(jsonResponse, Photos.class);
                    //////////////////////Photos/////Photos_///////
                    String data = photos.getPhotos().getPhoto().get(0).getTitle();
                    Log.d(TAG, "onResponse: " + data);
                    ArrayList<Photo> photoArrayList = new ArrayList<>(photos.getPhotos().getPhoto());
                    EventBus.getDefault().post(photoArrayList);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
