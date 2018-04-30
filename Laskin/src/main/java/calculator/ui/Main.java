/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

/**
 * Sovelluksen main-luokka, jossa luodaan ja käynnistetään Calculator-luokan olio.
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }
}
