package com.example.kamal.instantambulance.LiveSaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import com.example.kamal.instantambulance.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saver_login);


        TextView textView = findViewById(R.id.login);

        String text = "Dont have an account? Sign Up";

        SpannableString ss =new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent login = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(login);
                finish();
            }
        };

        ss.setSpan(clickableSpan,22,29, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
