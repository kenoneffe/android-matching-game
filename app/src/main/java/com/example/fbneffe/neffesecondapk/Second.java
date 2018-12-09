package com.example.fbneffe.neffesecondapk;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Second extends AppCompatActivity implements View.OnClickListener {

    // Button ID Initialization
    private int []buttons = new int[]{
            R.id.button0,R.id.button1,R.id.button2,R.id.button3,
            R.id.button4,R.id.button5,R.id.button6,R.id.button7,
            R.id.button8,R.id.button9,R.id.button10,R.id.button11,
            R.id.button12,R.id.button13,R.id.button14,R.id.button15,
    };

    private String []button_storage = new String[16];

    // For countdown timer
    private TextView midEdit;

    String[] array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);


        // Timer Variables
        midEdit = (TextView) findViewById(R.id.countdown);
        timer();
        alphabetRandomizer();
        showAll();

        //Button Listener Initialization
        Button one = (Button) findViewById(R.id.button0);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.button1);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button2);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button3);
        four.setOnClickListener(this);
        Button five =(Button) findViewById(R.id.button4);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button5);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button6);
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.button7);
        eight.setOnClickListener(this);
        Button nine =(Button) findViewById(R.id.button8);
        nine.setOnClickListener(this);
        Button ten = (Button) findViewById(R.id.button9);
        ten.setOnClickListener(this);
        Button eleven =(Button) findViewById(R.id.button10);
        eleven.setOnClickListener(this);
        Button twelve = (Button) findViewById(R.id.button11);
        twelve.setOnClickListener(this);
        Button thirteen =(Button) findViewById(R.id.button12);
        thirteen.setOnClickListener(this);
        Button fourteen = (Button) findViewById(R.id.button13);
        fourteen.setOnClickListener(this);
        Button fifteen = (Button) findViewById(R.id.button14);
        fifteen.setOnClickListener(this);
        Button sixteen = (Button) findViewById(R.id.button15);
        sixteen.setOnClickListener(this);


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
                hideAll();
            }
        }.start();

    }


    public void alphabetRandomizer(){

        String []arr = this.getResources().getStringArray(R.array.alphabet);
        boolean[] chosen_already = new boolean[16];
        String strr = "";

        for (int i = 0; i < 16; i++) {
            Button btn = findViewById(buttons[i]);
            // do random here
            Random r = new Random();
            int num = r.nextInt(16);

            do{
                if(chosen_already[num]){
                    num = r.nextInt(16);
                }
                if (!chosen_already[num]) {
                    button_storage[i] = arr[num];
                    chosen_already[num] = true;
                    break;
                }
            }while(chosen_already[num]);
        }
    }

    public void toggleButton(TextView v){
        v.setText("Button assigned here");
    }

    @Override
    public void onClick(View view) {
        TextView currButtText = (TextView) findViewById(view.getId());
        currButtText.setText(button_storage[getIndex(view)]);
    }

    private int getIndex(View view){
        for(int i = 0; i < buttons.length; i++){
            if(buttons[i] == view.getId()){
                return i;
            }
        }
        return 0;
    }

    private void showAll(){
        for(int i=0; i<16; i++){
            Button btn = (Button) findViewById(buttons[i]);
            btn.setText(button_storage[i]);
            btn.setEnabled(false);
        }
    }

    private void hideAll(){
        for(int i=0; i<16; i++){
            Button btn = (Button) findViewById(buttons[i]);
            btn.setText("???");
            btn.setEnabled(true);
        }
    }


}
