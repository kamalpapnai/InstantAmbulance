package com.example.kamal.instantambulance;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {

    private int delayInSec = 4000;
    private SplashActivity splashActivity;
    private TextView initText;
    private ImageView whiteCross;

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

        initText = (TextView)findViewById(R.id.instantText);
        whiteCross = (ImageView)findViewById(R.id.white_cross);
        rotate();
        fade();




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

    public void fade(){
        TextView init_text = (TextView)findViewById(R.id.instantText);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fadetext);
        init_text.startAnimation(animation2);
    }

    public void rotate(){
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.rotate);
        whiteCross.startAnimation(animation1);
    }
}
