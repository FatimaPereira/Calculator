package com.example.fatimapereira.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNumber0;
    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;
    Button btnDecimalSeparator;

    Button btnDivision;
    Button btnMultiplication;
    Button btnSubtraction;
    Button btnAddition;
    Button btnResultOperator;

    Button btnReset;
    TextView textViewField;

    boolean update = false;
    String saveText;

    private CalculatorManager calculatorManager = new CalculatorManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        double pour utilisation virgule = ça marche
//        double test = .1;
//        Log.e("test", String.valueOf(test));

        //*******************************************************
        //        NUMBER
        //*******************************************************
        btnNumber0 = (Button) findViewById(R.id.btn_0);
        btnNumber1 = (Button) findViewById(R.id.btn_1);
        btnNumber2 = (Button) findViewById(R.id.btn_2);
        btnNumber3 = (Button) findViewById(R.id.btn_3);
        btnNumber4 = (Button) findViewById(R.id.btn_4);
        btnNumber5 = (Button) findViewById(R.id.btn_5);
        btnNumber6 = (Button) findViewById(R.id.btn_6);
        btnNumber7 = (Button) findViewById(R.id.btn_7);
        btnNumber8 = (Button) findViewById(R.id.btn_8);
        btnNumber9 = (Button) findViewById(R.id.btn_9);

        btnDecimalSeparator = (Button) findViewById(R.id.btn_decimal_separator);


        //--- NUMBER OnClick --------------------------------
        btnNumber0.setOnClickListener(new View.OnClickListener() {
            int number = 0;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }


        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            int number = 1;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            int number = 2;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            int number = 3;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            int number = 4;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            int number = 5;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            int number = 6;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            int number = 7;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            int number = 8;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            int number = 9;
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });

        btnDecimalSeparator.setOnClickListener(new View.OnClickListener() {
            String number = ".";
            @Override
            public void onClick(View view) {
                displayNumber(number);
            }
        });


        //*******************************************************
        //        OPERATOR
        //*******************************************************
        btnDivision = (Button) findViewById(R.id.btn_division);
        btnMultiplication = (Button) findViewById(R.id.btn_multiplication);
        btnSubtraction = (Button) findViewById(R.id.btn_subtraction);
        btnAddition = (Button) findViewById(R.id.btn_addition);
        btnResultOperator = (Button) findViewById(R.id.btn_result);

        //--- OPERATOR OnClick --------------------------------
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            calculatorManager.operatorAddition(Double.valueOf(textViewField.getText().toString()));
//               textViewField.setText("");
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

        btnReset = (Button) findViewById(R.id.btn_c);
        textViewField = (TextView) findViewById(R.id.field_number);
        saveText = textViewField.getText().toString();

        //--- OTHER OnClick --------------------------------

        //textViewField.setText("0");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewField.setText("0");
            }
        });
    }
    //--- METHOD Number --------------------------------

    //Affichage du chiffre à l'écran - Method Polymorphe
    public void displayNumber(String string) {
        saveText = textViewField.getText().toString();
        if (saveText.equals("0")) {
            textViewField.setText(string);
        } else {
            textViewField.setText(saveText + string);
        }
    }
    // (String.valueOf(btnNumber)) = même chose que cast
    public void displayNumber(int btnNumber) {
        saveText = textViewField.getText().toString();
        if (saveText.equals("0")) {
            textViewField.setText(String.valueOf(btnNumber));
        } else {
            textViewField.setText(saveText + btnNumber);
        }

    }

    //Affichage de l'opérateur
}



