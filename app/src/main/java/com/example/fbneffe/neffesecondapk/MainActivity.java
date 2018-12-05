package com.example.fbneffe.neffesecondapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gsbttn;
    private Button quitbbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quitbbtn = findViewById(R.id.button4);
        quitbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        gsbttn = findViewById(R.id.button);
        gsbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


    }

    public void openActivity2(){

        Intent intent = new Intent(this, Second.class);
        startActivity(intent);

    }
}
