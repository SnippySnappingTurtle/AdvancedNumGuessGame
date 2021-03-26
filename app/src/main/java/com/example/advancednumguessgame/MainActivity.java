package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        //String Easy intentRes.getStringExtra("Easy");
        //String Medium intentRes.getStringExtra("Medium");
        //String Hard intentRes.getStringExtra("Hard");
        //todo if string = 1 select easy, if = 2 select medium, if = 3 select hard
    }

    public void runGame(View view) {
        //TODO change these by the activity before //if they select easy 4 boxes range of 9, med 6 and 15, hard 8 and 20
        Intent start = getIntent();
        String level = start.getStringExtra("Level");
        int numberOfButtons = new Integer(level);
        String range = start.getStringExtra("Range");
        int rangeOfNumbers = new Integer(range);

        // Array of integers
        int[] arrayNumber = new int[]{};
        for (int i = 0; i < rangeOfNumbers; i++) {
            //make random number
            Random r = new Random();
            int aNumber = r.nextInt(rangeOfNumbers);


            //todo check if number is duplicated

            //get average
            int total = Arrays.stream(arrayNumber).sum();
            float average = total / numberOfButtons;
            if(i < rangeOfNumbers && arrayNumber[i] - average > 0) {
                Log.d("success", "Well done!");
            }
            else
            Log.d("failure", "Try again!");
        }


        // find winning number
        //make a timer
        // create an array of buttons (make one button the winning button or check after clickon() if it was right or setBUtton(withNumber)

    }






    public void endButton(View view) {
        Intent get_to_start_screen = new Intent(this, MainActivity2.class);
        startActivity(get_to_start_screen);

    }
        }
