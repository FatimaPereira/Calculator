package com.example.fatimapereira.calculator;

/**
 * Created by Human Booster on 18/11/2016.
 */

public class CalculatorManager {

    private String operator = "";
    private double firstValue;
    private double value;

    //*******************************************************
    //        GETTER & SETTER
    //*******************************************************
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    //*******************************************************
    //        OPERATOR
    //*******************************************************

    public void operatorSwitch(double value) {
        //saveText = textViewField.getText().toString();
        switch (operator) {
            case "+":
                value = value + firstValue;
            case "-":
                value = value + firstValue;
            case "/":
                value = value + firstValue;
            case "*":
                value = value + firstValue;
            break;
            default:
                value = 0000;
        }

    }

}

