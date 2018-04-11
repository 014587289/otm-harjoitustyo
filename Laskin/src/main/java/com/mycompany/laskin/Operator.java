
package com.mycompany.laskin;

public class Operator {
    
    private double lastInput;
    private double lastResult;
    private String lastOperation;
    
    public Operator() {
        this.lastInput = 0;
        this.lastResult = 0;
        this.lastOperation = "";
        
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public double getLastInput() {
        return lastInput;
    }

    public void setLastInput(double lastInput) {
        this.lastInput = lastInput;
    }

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }
    
    
    
    public double sum(double firstNumber, double secondNumber) {
        lastResult = (firstNumber + secondNumber);
        return lastResult;
    }
    public double substraction(double firstNumber, double secondNumber) {
        lastResult = firstNumber - secondNumber;
        return lastResult;
    }
    public double division(double firstNumber, double secondNumber) {
        lastResult = firstNumber / secondNumber;
        return lastResult;
    }
    public double multiplication(double firstNumber, double secondNumber) {
        lastResult = firstNumber * secondNumber;
        return lastResult;
    }
    public double power(double firstNumber, double secondNumber) {
        lastResult = Math.pow(firstNumber, secondNumber);
        return lastResult;
    }
    public double equals() {
        return lastResult;
    }
    public double sqrt(double number) {
        lastResult = Math.sqrt(number);
        return lastResult;
    }
    public double sin(double number) {
        lastResult = Math.sin(number);
        return lastResult;
    }
    public double cos(double number) {
        lastResult = Math.cos(number);
        return lastResult;
    }
    public double tan(double number) {
        lastResult = Math.tan(number);
        return lastResult;
    }
    public double arcsin(double number) {
        lastResult = Math.asin(number);
        return lastResult;
    }
    public double arccos(double number) {
        lastResult = Math.acos(number);
        return lastResult;
    }
    public double arctan(double number) {
        lastResult = Math.atan(number);
        return lastResult;
    }
    public double root(double number) {
        lastResult = Math.r(number);
        return lastResult;
    }
    
}
