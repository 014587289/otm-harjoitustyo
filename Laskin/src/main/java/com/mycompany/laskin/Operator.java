
package com.mycompany.laskin;

public class Operator {
    
    private double lastInput;
    private double lastResult;
    
    public Operator() {
        this.lastInput = 0;
        this.lastResult = 0;
        
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
    
}
