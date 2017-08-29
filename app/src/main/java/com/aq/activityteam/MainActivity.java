package com.aq.activityteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Start.fire");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Close.fire");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("release.fire");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Start.lunch");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
