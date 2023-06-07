package com.example.shubham_deolus_numbersgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 public void handleClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        if(buttonText.equals("Reset")){
            Log.i("test","test");
            Button button1 = findViewById(R.id.gridbuttton1);
            Button button2 = findViewById(R.id.gridbuttton2);
            Button button3 = findViewById(R.id.gridbuttton3);
            Button button4 = findViewById(R.id.gridbuttton4);
            Button button5 = findViewById(R.id.gridbuttton5);
            Button button6 = findViewById(R.id.gridbuttton6);
            Button button7 = findViewById(R.id.gridbuttton7);
            Button button8 = findViewById(R.id.gridbuttton8);
            Button button9 = findViewById(R.id.gridbuttton9);

            button1.setText("2");
            button2.setText("0");
            button3.setText("0");
            button4.setText("5");
            button5.setText("5");
            button6.setText("0");
            button7.setText("8");
            button8.setText("5");
            button9.setText("4");

        }else {
            int currentNumber = Integer.parseInt(buttonText);

            if (currentNumber < 5) {
                currentNumber = currentNumber + 1;
            } else if (currentNumber > 5) {
                currentNumber = currentNumber - 1;
            }else{
                //nothing do
            }

            button.setText(String.valueOf(currentNumber));
        }

    }


}