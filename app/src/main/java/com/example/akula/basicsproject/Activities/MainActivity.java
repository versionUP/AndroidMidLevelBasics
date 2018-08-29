package com.example.akula.basicsproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.akula.basicsproject.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_1);
        button.setOnClickListener(this);
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_1:
                Intent intent1 = new Intent(this, Main2Activity.class);
                startActivity(intent1);
                break;
            case R.id.button_2:
                Intent intent2 = new Intent(this, Main3Activity.class);
                startActivity(intent2);
                break;
            case R.id.button_3:
                Intent intent3 = new Intent(this, Main4Activity.class);
                startActivity(intent3);
                break;
             case R.id.button_4:
                Intent intent4 = new Intent(this, Main5Activity.class);
                startActivity(intent4);
                break;
             case R.id.button_5:
                Intent intent5 = new Intent(this, Main6Activity.class);
                startActivity(intent5);
                break;
        }
    }
}
