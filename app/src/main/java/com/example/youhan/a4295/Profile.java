package com.example.youhan.a4295;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("Profile");

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar_p);
        setSupportActionBar(myToolbar);

        ImageButton m1=(ImageButton)findViewById(R.id.button1_p);
        ImageButton m2=(ImageButton)findViewById(R.id.button2_p);
        ImageButton m3=(ImageButton)findViewById(R.id.button3_p);
        ImageButton m4=(ImageButton)findViewById(R.id.button4_p);
        ImageButton m5=(ImageButton)findViewById(R.id.button5_p);

        m1.setBackgroundColor(Color.parseColor("#808080"));
        m2.setBackgroundColor(Color.parseColor("#808080"));
        m3.setBackgroundColor(Color.parseColor("#808080"));
        m4.setBackgroundColor(Color.parseColor("#808080"));
        m5.setBackgroundColor(Color.parseColor("#808080"));

        m1.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i.setClass(Profile.this, MainActivity.class);
                startActivity(i);
            }
        });

        m4.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent();
                i.setClass(Profile.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
