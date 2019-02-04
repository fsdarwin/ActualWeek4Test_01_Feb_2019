package com.example.actualweek4test_01_feb_2019.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.actualweek4test_01_feb_2019.Pojos.Photo;
import com.example.actualweek4test_01_feb_2019.R;

public class Activity3 extends AppCompatActivity {
    //DECLARE variables
    EditText vCriteria;
    Photo searchPhoto;
    Intent passedIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //GET passed intent
        passedIntent = getIntent();
        searchPhoto = passedIntent.getParcelableExtra("photo");

        //SET variables to TextViews
        TextView vId = findViewById(R.id.tvId);
        TextView vOwner = findViewById(R.id.tvOwner);
        TextView vSecret = findViewById(R.id.tvSecret);
        TextView vFarm = findViewById(R.id.tvFarm);
        TextView vTitle = findViewById(R.id.tvTitle);
        TextView vIsPublic = findViewById(R.id.tvIsPublic);
        TextView vIsFriend = findViewById(R.id.tvIsFriend);
        TextView vIsFamily = findViewById(R.id.tvIsFamily);

        //SET TextViews to photo details
        vId.setText(searchPhoto.getId());
        vOwner.setText(searchPhoto.getOwner());
        vSecret.setText(searchPhoto.getSecret());
        vFarm.setText(searchPhoto.getFarm());
        vTitle.setText(searchPhoto.getTitle());
        vIsPublic.setText(searchPhoto.getIspublic());
        vIsFriend.setText(searchPhoto.getIsfriend());
        vIsFamily.setText(searchPhoto.getIsfamily());
    }


}
