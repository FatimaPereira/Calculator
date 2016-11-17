package com.example.fatimapereira.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //*******************************************************
        //        NUMBER
        //*******************************************************
        Button btnNumber0 = (Button) findViewById(R.id.btn_0);
        Button btnNumber1 = (Button) findViewById(R.id.btn_1);
        Button btnNumber2 = (Button) findViewById(R.id.btn_2);
        Button btnNumber3 = (Button) findViewById(R.id.btn_3);
        Button btnNumber4 = (Button) findViewById(R.id.btn_4);
        Button btnNumber5 = (Button) findViewById(R.id.btn_5);
        Button btnNumber6 = (Button) findViewById(R.id.btn_6);
        Button btnNumber7 = (Button) findViewById(R.id.btn_7);
        Button btnNumber8 = (Button) findViewById(R.id.btn_8);
        Button btnNumber9 = (Button) findViewById(R.id.btn_9);

        Button btnDecimalSeparator = (Button) findViewById(R.id.btn_decimal_separator);

        //--- NUMBER OnClick --------------------------------
        btnNumber0.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 0;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 1;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 2;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 3;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 4;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 5;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 6;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 7;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 8;
            @Override
            public void onClick(View view) {

            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            int btnNumber = 9;
            @Override
            public void onClick(View view) {

            }
        });

        btnDecimalSeparator.setOnClickListener(new View.OnClickListener() {
            String decimalSeparateur = ",";
            @Override
            public void onClick(View view) {

            }
        });

        //*******************************************************
        //        OPERATOR
        //*******************************************************
        Button btnDivision = (Button) findViewById(R.id.btn_division);
        Button btnMultiplication = (Button) findViewById(R.id.btn_multiplication);
        Button btnSubtraction = (Button) findViewById(R.id.btn_subtraction);
        Button btnAddition = (Button) findViewById(R.id.btn_addition);
        Button btnResultOperator = (Button) findViewById(R.id.btn_result);

        //--- OPERATOR OnClick --------------------------------
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnResultOperator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //*******************************************************
        //        OTHER
        //*******************************************************

        Button btnReset = (Button) findViewById(R.id.btn_c);
        TextView textViewField = (TextView) findViewById(R.id.field_number);

        //--- OTHER OnClick --------------------------------

       //textViewField.setText("0");

        btnReset.setOnClickListener(new View.OnClickListener() {
            int btnReset = 0;
            @Override
            public void onClick(View view) {


            }
        });




    }
}
