package com.example.akula.basicsproject.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.akula.basicsproject.R;
import com.example.akula.basicsproject.fragments.FragmentAtRun4;
import com.example.akula.basicsproject.fragments.FragmentAtRun5;
import com.example.akula.basicsproject.fragments.FragmentAtRun5.onMessageReadListener;
import com.example.akula.basicsproject.fragments.FragmentAtRun6;

public class Main5Activity extends AppCompatActivity implements  onMessageReadListener  {


    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fragment_containerIn5);

        if (frameLayout == null) { return; }
        if (savedInstanceState != null) { return; }

        fragmentManager = getSupportFragmentManager();
        FragmentAtRun5 run1 = new FragmentAtRun5();

        fragmentManager.beginTransaction()
                .add(R.id.fragment_containerIn5, run1, null)
                .commit();
    }

    @Override
    public void onMessageRead(String message) {
        FragmentAtRun6  run6  = new FragmentAtRun6();
        Bundle bundle = new Bundle();
        bundle.putString("message",message);
        run6.setArguments(bundle);

         fragmentManager.beginTransaction()
                        .replace(R.id.fragment_containerIn5,run6,null)
                        .addToBackStack(null)
                        .commit();
    }
}
