package com.zeydalcan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText numberone;
    EditText numbertwo;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberone = findViewById(R.id.editTextText2);
        numbertwo = findViewById(R.id.editTextText3);
        resultText = findViewById(R.id.textView);

    }


    public void topla(View view) {
        if (numbertwo.getText().toString().matches("")|| numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Please Enter Number..");
        }
        else {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int result = number1 + number2;
            resultText.setText("result : " + result);


        }

    }

    public void cikar(View view) {
        if (numbertwo.getText().toString().matches("")|| numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Please Enter Number..");
        }
        else {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int result = number1 - number2;
            resultText.setText("result : " + result);


        }

    }

    public void carp(View view) {
        if (numbertwo.getText().toString().matches("")|| numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Please Enter Number..");
        }
        else {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int result = number1 * number2;
            resultText.setText("result : " + result);


        }
    }

    public void bol(View view) {
        if (numbertwo.getText().toString().matches("")|| numbertwo.getText().toString().matches(""))
        {
            resultText.setText("Please Enter Number..");
        }
        else {
            int number1 = Integer.parseInt(numberone.getText().toString());
            int number2 = Integer.parseInt(numbertwo.getText().toString());
            int result = number1 /number2;
            resultText.setText("result : " + result);


        }
    }

}