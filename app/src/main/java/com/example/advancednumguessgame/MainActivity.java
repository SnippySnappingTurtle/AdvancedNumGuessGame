package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1, num2, num3, num4;
    private int score;

    private void roll() {
        Random r = new Random();
        num1 = r.nextInt(9);
        num2 = r.nextInt(9);
        num3 = r.nextInt(9);
        num4 = r.nextInt(9);

        while (num1 == num2)
            num2 = r.nextInt(9);
        while (num1 == num3)
            num3 = r.nextInt(9);
        while (num1 == num4)
            num4 = r.nextInt(9);
        while (num2 == num3)
            num3 = r.nextInt(9);
        while (num2 == num4)
            num4 = r.nextInt(9);
        while (num3 == num4)
            num4 = r.nextInt(9);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("" + num1);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("" + num2);

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setText("" + num3);

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setText("" + num4);


    }

    private void check(int average) {
        if (average - num1 < average - num2 || average - num1 < average - num3 || average - num1 < average- num4){
            score++;
            Toast.makeText(this, "Well done!", Toast.LENGTH_SHORT).show();
        } else {
            score--;
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show();
        }

        TextView txtScore = (TextView) findViewById(R.id.txtScore);
        txtScore.setText("Score:" + score);

        roll();

    }

    public void clickbutton1(View view) {
        int average = (num1 + num2 + num3 + num4)/4;
    }

    public void clickbutton2(View view) { int average = (num1 + num2 + num3 + num4)/4;
    }

    public void clickbutton3(View view) {
        int average = (num1 + num2 + num3 + num4)/4;
    }
    public void clickbutton4(View view) {
        int average = (num1 + num2 + num3 + num4)/4;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll();
    }
}