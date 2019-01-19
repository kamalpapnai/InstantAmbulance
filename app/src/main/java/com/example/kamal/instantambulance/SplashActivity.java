package com.example.kamal.instantambulance;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private int delayInSec = 2000;
    private SplashActivity splashActivity;

    @Override
    protected void onStop() {
        super.onStop();
        splashActivity.finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splashActivity = this;

        Handler mhandler = new Handler();
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },delayInSec);

    }
}
