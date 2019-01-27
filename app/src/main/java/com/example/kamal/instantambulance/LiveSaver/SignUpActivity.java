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
import android.widget.Button;
import android.widget.TextView;

import com.example.kamal.instantambulance.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saver_signin);

        TextView textView = findViewById(R.id.signup);

        String text = "Already a member? Login Here";

        SpannableString ss =new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent signup = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(signup);
                finish();
            }
        };

        ss.setSpan(clickableSpan,18,28,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


    }


}
