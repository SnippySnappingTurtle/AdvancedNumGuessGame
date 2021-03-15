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
    private int score = 0;
    public int counter;
    Button startButton;
    TextView timer;

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


        Button b1 = findViewById(R.id.button1);
        b1.setText("" + num1);

        Button b2 = findViewById(R.id.button2);
        b2.setText("" + num2);

        Button b3 = findViewById(R.id.button3);
        b3.setText("" + num3);

        Button b4 = findViewById(R.id.button4);
        b4.setText("" + num4);



    }

    private void check(int num1, int num2, int num3, int num4) {

        double average = (num1+num2+num3+num4)/4;
        double rem1 = Math.abs(num1-average);
        double rem2 = Math.abs(num2-average);
        double rem3 = Math.abs(num3-average);
        double rem4 = Math.abs(num4-average);

        if (rem1 < rem2 && rem1 < rem3 && rem1 < rem4) {
            score++;
            Toast.makeText(this, "Well done!", Toast.LENGTH_SHORT).show();
        } else {
            score--;
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show();
            }

        TextView txtScore = findViewById(R.id.txtScore);
        txtScore.setText("Score:" + score);

        roll();

    }

    public void ClickButton1(View view) {
        check(num1, num2, num3, num4);

        roll();

    }

    public void ClickButton2(View view) {
        check(num1, num2, num3, num4);

        roll();
    }

    public void ClickButton3(View view) {

        check(num1, num2, num3, num4);

        roll();
    }
    public void ClickButton4(View view) {

        check(num1, num2, num3, num4);

        roll();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll();
    }
}