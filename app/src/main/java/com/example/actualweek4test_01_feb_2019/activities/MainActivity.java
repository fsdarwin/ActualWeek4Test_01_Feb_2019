package com.example.actualweek4test_01_feb_2019.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.actualweek4test_01_feb_2019.R;

public class MainActivity extends AppCompatActivity{
    //DECLARE variables
    EditText vCriteria;
    String searchString;
    Intent sendToActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        //INSTANTIATE EditText and get the value
        vCriteria = findViewById(R.id.etCriteria);
        searchString = vCriteria.getText().toString();

        //CREATE new MainActivityPresenter with the searchString
        new MainActivityPresenter(searchString);
        startActivity(new Intent(this, Activity2.class));
    }
}
