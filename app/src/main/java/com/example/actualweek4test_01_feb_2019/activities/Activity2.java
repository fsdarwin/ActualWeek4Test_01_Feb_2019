package com.example.actualweek4test_01_feb_2019.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.actualweek4test_01_feb_2019.Pojos.Photo;
import com.example.actualweek4test_01_feb_2019.R;
import com.example.actualweek4test_01_feb_2019.adaptors.RvAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Photo> photoArrayList;
    RvAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView = findViewById(R.id.rvMain);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    //RECEIVE arrayList from eventBus
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ArrayList<Photo> event) {
        if (event != null) {
            photoArrayList = event;
            //FINISH setting up RV Adapter
            rvAdapter = new RvAdapter(photoArrayList);
            recyclerView.setAdapter(rvAdapter);
        }
    }
}
