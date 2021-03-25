package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void startButton(View view) {
        //make start
        Intent start = new Intent(this,MainActivity.class);
        startActivity(start);

        //get button choice easyButton mediumButton or hardButton
        View be = findViewById(R.id.easyButton);
        be.setEnabled(false);
        Button be1 = (Button) be;
        be1.setClickable(true);

        View bm = findViewById(R.id.mediumButton2);
        be.setEnabled(false);
        Button bm1 = (Button) bm;
        bm1.setClickable(true);

        Button bh = findViewById(R.id.hardButton3);
        be.setEnabled(false);
        Button bh1 = (Button) bh;
        bh1.setClickable(true);

        TextView t = findViewById(R.id.name);
        String input = t.getText().toString();
        Toast.makeText(this,"Welcome" + input, Toast.LENGTH_LONG);



        //move to mainactivity
        start.putExtra("Easy", 1);
        start.putExtra("Medium", 2);
        start.putExtra("Hard", 3);
    }
}