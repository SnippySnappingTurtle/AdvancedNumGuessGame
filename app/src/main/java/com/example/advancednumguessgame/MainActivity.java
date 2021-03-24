package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentRes = getIntent();
        String Easy intentRes.getStringExtra("Easy");
        String Medium intentRes.getStringExtra("Medium");
        String Hard intentRes.getStringExtra("Hard");
    //todo if string = 1 select easy, if = 2 select medium, if = 3 select hard


    }
    public void runGame() {
        //TODO change these by the activity before //if they select easy 4 boxes range of 9, med 6 and 15, hard 8 and 20
        int numberOfButtons = 6;
        int rangeOfNumbers = 9;

        // Array of integers
        int arrayNumber[] = {};

        for (int i = 0; i < numberOfButtons; i++) {
            //make random number
            Random r = new Random();
            int aNumber = r.nextInt(rangeOfNumbers);
            //todo check if number is duplicated

            //get average
            int total = Arrays.stream(arrayNumber).sum();
            int average = total/numberOfButtons;
            arrayNumber[i] = aNumber;
            average += aNumber;
        }

        // find winning number
        //make a timer
        // create an array of buttons (make one button the winning button or check after clickon() if it was right or setBUtton(withNumber)

    }

    private int num1, num2, num3, num4, num5, num6, num7, num8;
    private int score = 0;
    public int counter;
    TextView timer;
    double rem[];

    private void roll() {
        Random r = new Random();
        num1 = r.nextInt(9);
        num2 = r.nextInt(9);
        num3 = r.nextInt(9);
        num4 = r.nextInt(9);
        num5 = r.nextInt(9);
        num6 = r.nextInt(9);
        num7 = r.nextInt(9);
        num8 = r.nextInt(9);

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

        Button b5 = findViewById(R.id.button5);
        b5.setText("" + num5);

        Button b6 = findViewById(R.id.button6);
        b6.setText("" + num6);

        Button b7 = findViewById(R.id.button7);
        b7.setText("" + num7);

        Button b8 = findViewById(R.id.button8);
        b8.setText("" + num8);


    }

    private void check(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8) {

        double average = (num1+num2+num3+num4+num5+num6+num7+num8)/8;
        double rem1 = Math.abs(num1-average);
        double rem2 = Math.abs(num2-average);
        double rem3 = Math.abs(num3-average);
        double rem4 = Math.abs(num4-average);
        double rem5 = Math.abs(num5-average);
        double rem6 = Math.abs(num6-average);
        double rem7 = Math.abs(num7-average);
        double rem8 = Math.abs(num8-average);


        }
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
        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();

    }

    public void ClickButton2(View view) {
        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }

    public void ClickButton3(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }
    public void ClickButton4(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }
    public void ClickButton5(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }
    public void ClickButton6(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }
    public void ClickButton7(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }
    public void ClickButton8(View view) {

        check(num1, num2, num3, num4, num5, num6, num7, num8);

        roll();
    }

    public void endButton(View view) {
        Intent get_to_start_screen = new Intent(this, MainActivity2.class);
        startActivity(get_to_start_screen);

    }




}