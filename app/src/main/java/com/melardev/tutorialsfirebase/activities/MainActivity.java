package com.melardev.tutorialsfirebase.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.melardev.tutorialsfirebase.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startDemo(Class className) {
        startActivity(new Intent(this, className));
    }


    public void loginGithub(View view) {
        startDemo(ActivityGithub.class);
    }
}


