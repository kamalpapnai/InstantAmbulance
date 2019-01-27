package com.example.kamal.instantambulance.Hospital;

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

import com.example.kamal.instantambulance.LiveSaver.LoginActivity;
import com.example.kamal.instantambulance.R;

public class HospitalSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_signup);

        TextView textView = findViewById(R.id.hospital_signUp);

        String text = "Already a member? Login Here";

        SpannableString ss =new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent signup = new Intent(HospitalSignUp.this, HospitalLogin.class);
                startActivity(signup);
                finish();
            }
        };

        ss.setSpan(clickableSpan,18,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
