package com.example.fbneffe.neffesecondapk;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Second extends AppCompatActivity implements View.OnClickListener {

    // Button ID Initialization
    private int []buttons = new int[]{
            R.id.button0,R.id.button1,R.id.button2,R.id.button3,
            R.id.button4,R.id.button5,R.id.button6,R.id.button7,
            R.id.button8,R.id.button9,R.id.button10,R.id.button11,
            R.id.button12,R.id.button13,R.id.button14,R.id.button15,
    };

    // For countdown timer
    private TextView midEdit;

    // Alphabet initialization
    // 16 / 2 = 8, which means we only need 8 letters
    private char[] alphabet2 = "abcdefgh".toCharArray();
    private char[] alphabet1 = "abcdefgh".toCharArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        // Timer Variables
        midEdit = (TextView) findViewById(R.id.countdown);
        timer();

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

    //TODO: Button Toggle
    public void toggleButton(View view){
        view.getId();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                Toast.makeText(this, findViewById(buttons[0]).getId()+" ya boi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button1:
                // do your code
                break;

            case R.id.button2:
                // do your code
                break;
            case R.id.button3:
                // do your code
                break;

            case R.id.button4:
                // do your code
                break;
            case R.id.button5:
                // do your code
                break;

            case R.id.button6:
                // do your code
                break;
            case R.id.button7:
                // do your code
                break;

            case R.id.button8:
                // do your code
                break;
            case R.id.button9:
                // do your code
                break;

            case R.id.button10:
                // do your code
                break;
            case R.id.button11:
                // do your code
                break;

            case R.id.button12:
                // do your code
                break;
            case R.id.button13:
                // do your code
                break;

            case R.id.button14:
                // do your code
                break;
            case R.id.button15:
                // do your code
                break;
            default:
                break;
        }
    }

    //TODO: Randomizer

    //TODO: Just refer to daigler


}
