package com.example.akula.basicsproject.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.akula.basicsproject.R;
import com.example.akula.basicsproject.fragments.FragmentAtRun1;

public class Main3Activity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fragment_container);

        if (frameLayout == null) { return; }
        if (savedInstanceState != null) { return; }

        fragmentManager = getSupportFragmentManager();
        FragmentAtRun1 run1 = new FragmentAtRun1();
        FragmentTransaction transaction =
                fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, run1, null);
        transaction.commit();
    }

}
