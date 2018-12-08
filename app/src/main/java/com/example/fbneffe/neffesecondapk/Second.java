package com.example.fbneffe.neffesecondapk;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class Second extends AppCompatActivity {


    private int[] button = new int[]{
            R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9, R.id.button10, R.id.button11,
            R.id.button12, R.id.button13, R.id.button14, R.id.button15,
    };

    private TextView midEdit;

    String[] array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        //TODO: Ano man yung alphabet ni sir



        //TODO: Copy paste sir's code
        midEdit = (TextView) findViewById(R.id.countdown);

        timer();
        alphabetRandomizer();

    }

    public void timer() {

        new CountDownTimer(4000, 100) {

            @Override
            public void onTick(long millisUntilFinished) {


                midEdit.setText("0" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {

                midEdit.setText("00");

            }
        }.start();

    }

    public void alphabetRandomizer(){

        String []arr = this.getResources().getStringArray(R.array.alphabet);
        boolean[] chosen_already = new boolean[8];
        String strr = "";

        for (int i = 0; i < 8; i++) {
            Button btn = findViewById(button[i]);
            // do random here
            Random r = new Random();
            int num = r.nextInt(8);


            if (!chosen_already[num]) {

                btn.setText(arr[num] + " -? " + num);
                chosen_already[num] = true;

            } else {
                    btn.setText("  -? " + num);

            }


        }

    }


    //TODO: Button Toggle
    //TODO: Randomizer

    //TODO: Just refer to daigler


}
