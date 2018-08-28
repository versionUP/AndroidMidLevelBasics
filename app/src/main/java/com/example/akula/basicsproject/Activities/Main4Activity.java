package com.example.akula.basicsproject.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.akula.basicsproject.R;
import com.example.akula.basicsproject.fragments.FragmentAtRun1;
import com.example.akula.basicsproject.fragments.FragmentAtRun4;
import com.example.akula.basicsproject.fragments.FragmentAtRun4.onMessageReadListener;

public class Main4Activity extends AppCompatActivity implements onMessageReadListener {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fragment_container);

        if (frameLayout == null) { return; }
        if (savedInstanceState != null) { return; }

        fragmentManager = getSupportFragmentManager();
        FragmentAtRun4 run1 = new FragmentAtRun4();

        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, run1, null)
                .commit();

    }

    @Override
    public void onMessageReadListener(String messsage) {
        TextView textView = (TextView)findViewById(R.id.textView_display);
        textView.setText(messsage);
    }
}
