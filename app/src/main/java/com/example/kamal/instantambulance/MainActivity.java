package com.example.kamal.instantambulance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kamal.instantambulance.BloodDonor.BloodDonorLogin;
import com.example.kamal.instantambulance.Hospital.HospitalLogin;
import com.example.kamal.instantambulance.LiveSaver.LoginActivity;
import com.example.kamal.instantambulance.LiveSaver.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    private Button mlifesaver;
    private Button mHospital;
    private Button mBloodDonor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_login);

        //initialising reference to the buttons
        init_Reference();

        //setting up intents for the buttons
        setup_intents();
    }
    private void setup_intents(){
        mlifesaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        mHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HospitalLogin.class);
                startActivity(intent);
            }
        });

        mBloodDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BloodDonorLogin.class);
                startActivity(intent);
            }
        });


    }

    private void init_Reference(){
        mlifesaver = (Button)findViewById(R.id.btn_lifesaver);
        mHospital = (Button)findViewById(R.id.btn_hospital);
        mBloodDonor = (Button)findViewById(R.id.btn_blooddonor);
    }
}
