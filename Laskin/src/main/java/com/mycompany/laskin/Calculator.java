/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laskin;

import java.util.Scanner;

/**
 *
 * @author Kakshoo
 */
public class Calculator {
    
    private int calculations;
    //private file saveFile;
    private Scanner scanner;
    private Operator operator;
    
    public Calculator() {
        this.calculations = 0;
        //this.saveFile = ...;
        this.scanner = new Scanner(System.in);
        this.operator = new Operator();
        
    }
    
    public void startCalculator() {
        while(true) {
            System.out.println("Enter the first number, or enter 'e' if you want to exit.");
            try {
                String exitOrNumber = scanner.nextLine();
                if (exitOrNumber.equals("e")) {
                    System.out.println("Thank you for using the calculator.");
                    break;
                }
                double x = Double.parseDouble(exitOrNumber);
                operator.setLastInput(Double.parseDouble(exitOrNumber));
                operator.setLastResult(Double.parseDouble(exitOrNumber));
            }
            catch(NumberFormatException ex) {
                System.out.println("Invalid input, closing calculatore");
                break;
            }
            
            double firstInput = operator.getLastInput();
            System.out.println("Enter operation (+, -, /, *, =)");
            OUTER:
            while (true) {
                String operation = scanner.nextLine();
                if (!(operation.equals("+")) && !(operation.equals("-")) && !(operation.equals("/")) && !(operation.equals("*")) && !(operation.equals("="))) {
                    System.out.println("Unsupported operation, try again.");
                } else {
                    System.out.println("Enter the second number.");
                    operator.setLastInput(Double.parseDouble(scanner.nextLine()));
                    double secondInput = operator.getLastInput();
                
                    switch (operation) {
                        case "+":
                            double sum = operator.sum(operator.getLastResult(), secondInput);
                            System.out.println(sum);
                            break OUTER;
                        case "-":
                            double subs = operator.substraction(operator.getLastResult(), secondInput);
                            System.out.println(subs);
                            break OUTER;
                        case "/":
                            double divi = operator.division(operator.getLastResult(), secondInput);
                            System.out.println(divi);
                            break OUTER;
                        case "*":
                            double multi = operator.multiplication(operator.getLastResult(), secondInput);
                            System.out.println(multi);
                            break OUTER;
                        case "=":
                            double equ = operator.equals();
                            System.out.println(equ);
                            break OUTER;
                        default:
                            break;
                    }
                }
            }
        }
    }
    
    
    
    
    
}
