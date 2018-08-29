package com.example.akula.basicsproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.akula.basicsproject.R;

public class Main6Activity extends AppCompatActivity {


    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        toolbar = (Toolbar) findViewById(R.id.app_toolbar);  //custom action bar layout
        setSupportActionBar(toolbar);  // set custom action bar as a default action bar for activity
    }

}
