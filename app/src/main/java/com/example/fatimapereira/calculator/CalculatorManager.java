package com.example.fatimapereira.calculator;

import static android.R.attr.action;
import static com.example.fatimapereira.calculator.Actions.add;
import static com.example.fatimapereira.calculator.Actions.substract;

/**
 * Created by Human Booster on 18/11/2016.
 */

public class CalculatorManager {

    private String operator = "";
    private double firstValue;
    private double value;
    private double newValue;

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



    //*******************************************************
    //        OPERATOR
    //*******************************************************

    public void operatorSwitch(double number) {
        switch (action) {
            case add:
                number
                break;
            case substract:
                break;
            case multiply:
                break;
            case devide:
                break;
            default:
                value = 0;
        }

    }

}

