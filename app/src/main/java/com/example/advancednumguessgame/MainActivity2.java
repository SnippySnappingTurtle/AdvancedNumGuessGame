package com.example.advancednumguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton easyButton, mediumButton2, hardButton3;
    private Button startButton;
    String input;
    String level;
    String range;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        easyButton = (RadioButton) findViewById(R.id.easyButton);
        RadioButton be = (RadioButton) findViewById(R.id.easyButton);
        be.setEnabled(false);
        Button be1 = (Button) be;
        be1.setClickable(true);

        mediumButton2 = (RadioButton) findViewById(R.id.mediumButton2);
        RadioButton bm = (RadioButton) findViewById(R.id.mediumButton2);
        be.setEnabled(false);
        Button bm1 = (Button) bm;
        bm1.setClickable(true);


        hardButton3 = (RadioButton) findViewById(R.id.hardButton3);
        RadioButton bh = (RadioButton) findViewById(R.id.hardButton3);
        be.setEnabled(false);
        Button bh1 = (Button) bh;
        bh1.setClickable(true);

        startButton = (Button) findViewById(R.id.startButton);


        if (be.isChecked()) {
            level = "Easy";
            range = "Easy";
            Intent start = new Intent(this, MainActivity.class);
            start.putExtra("Level", 4);
            start.putExtra("Range",9);
            startActivity(start);
        } else if (bm.isChecked()) {
            level = "Medium";
            range = "Medium";
            Intent start = new Intent(this, MainActivity.class);
            start.putExtra("Level", 6);
            start.putExtra("Range",15);
            startActivity(start);
        } else if (bh.isChecked()) {
            level = "Hard";
            range = "Hard";
            Intent start = new Intent(this, MainActivity.class);
            start.putExtra("Level", 8);
            start.putExtra("Range",20);
            startActivity(start);
        } else             Log.d("failure", "Try again!");{

        }


        //public void text () {
            ;
          //  TextView t = findViewById(R.id.name);
           // String input = t.getText().toString();
           // Toast.makeText(this, "Welcome" + input, Toast.LENGTH_LONG);

        }
    }
//}