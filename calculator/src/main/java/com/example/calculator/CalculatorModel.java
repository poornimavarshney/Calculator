package com.example.calculator;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="Calculate")

public class CalculatorModel {
    private int number1;
    private int number2;
    private char operation;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    private int result;

    public CalculatorModel(int number1, int number2, char operation, int result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
        this.result = result;
    }
    public CalculatorModel(int number1, int number2, int result){
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    @Override
    public String toString(){
        return number1+" "+operation+" "+number2+" = "+result;
    }
}
