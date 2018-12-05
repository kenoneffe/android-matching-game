package com.example.fbneffe.neffesecondapk;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class Second extends AppCompatActivity {

    private EditText midEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);


        midEdit = (EditText) findViewById(R.id.midEditView);

        timer();



    }

    public void timer(){

        new CountDownTimer(4000, 100){

            @Override
            public void onTick(long millisUntilFinished) {


                midEdit.setText("0" + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {

                midEdit.setText("00");

            }
        }.start();

    }












}
