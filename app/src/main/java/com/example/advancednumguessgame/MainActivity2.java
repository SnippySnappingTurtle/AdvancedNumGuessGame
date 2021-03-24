package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ClickeasyButton(View view) {
    }
    public void ClickmediumButton2(View view) {

    }
    public void ClickhardButton3(View view) {

    }

    public void sendMessage(View view) {
        //make intent
        Intent intent = new Intent(this,MainActivity.class);

        //get button choice easyButton mediumButton or hardButton
        Button be = findViewById(R.id.easyButton);
        Button bm = findViewById(R.id.mediumButton2);
        Button bh = findViewById(R.id.hardButton3);



        //move to mainactivity
        intent.putExtra("Easy", 1);
        intent.putExtra("Medium", 2);
        intent.putExtra("Hard", 3);
    }
}