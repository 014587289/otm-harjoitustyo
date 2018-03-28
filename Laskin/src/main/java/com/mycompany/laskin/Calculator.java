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
    
    //private file saveFile;
    public Scanner scanner;
    public Operator operator;
    
    public Calculator() {
        //this.saveFile = ...;
        this.scanner = new Scanner(System.in);
        this.operator = new Operator();
        
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
    
    
    public void startCalculator() {
        System.out.println("Welcome to Calculator.app!");
        while (true) {
            System.out.println("What would you like to calculate?");
            System.out.println("1: Basic operations");
            System.out.println("2: Trigonometric operations");
            System.out.println("3: Roots");
            System.out.println("e: Exit");
            
            String command = scanner.nextLine();
            
            if(command.equals("1")) {
                System.out.println("Enter operation (+, -, /, *)");
                double firstInput = 0;
                double secondInput = 0;
                while (true) {
                    String operation = scanner.nextLine();
                    if (!(operation.equals("+")) && !(operation.equals("-")) && !(operation.equals("/")) && !(operation.equals("*"))) {
                        System.out.println("Unsupported operation, try again.");
                    } else {
                        this.operator.setLastOperation(operation);
                        break;
                      }
                }
                System.out.println("Enter first number or enter 'ans' to use last result.");
                String input = scanner.nextLine();
                if (input.equals("ans")) {
                    operator.setLastInput(operator.getLastResult());
                    firstInput = operator.getLastResult();
                } else {
                    try {
                      firstInput = Double.parseDouble(input);
                      operator.setLastInput(firstInput);
                      
                        
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid input, closing calculator");
                        break;
                    }
                }
                System.out.println("Enter second number or enter 'ans' to use last result.");
                
                input = scanner.nextLine();
                if (input.equals("ans")) {
                    operator.setLastInput(operator.getLastResult());
                    secondInput = operator.getLastResult();
                } else {
                    try {
                      secondInput = Double.parseDouble(input);
                      operator.setLastInput(secondInput);
                  
                        
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid input, closing calculator");
                        break;
                    }
                }
                if (operator.getLastOperation().equals("+")) {
                    operator.sum(firstInput, secondInput);
                    System.out.println(firstInput + "+" + secondInput + " = " + operator.getLastResult());
                }
                if (operator.getLastOperation().equals("-")) {
                    operator.substraction(firstInput, secondInput);
                    System.out.println(firstInput + "-" + secondInput + " = " + operator.getLastResult());
                }
                if (operator.getLastOperation().equals("/")) {
                    operator.division(firstInput, secondInput);
                    System.out.println(firstInput + "/" + secondInput + " = " + operator.getLastResult());
                }
                if (operator.getLastOperation().equals("*")) {
                    operator.multiplication(firstInput, secondInput);
                    System.out.println(firstInput + "*" + secondInput + " = " + operator.getLastResult());
                }  
                
                
                
                
                
            }
        }
    }
}


                        
                        
                        
                        
                        
                        //try {
//                String exitOrNumber = scanner.nextLine();
//                if (exitOrNumber.equals("e")) {
//                    System.out.println("Thank you for using the calculator.");
//                    break;
//                }
//                double x = Double.parseDouble(exitOrNumber);
//                operator.setLastInput(Double.parseDouble(exitOrNumber));
//                operator.setLastResult(Double.parseDouble(exitOrNumber));
//            } catch (NumberFormatException ex) {
//                System.out.println("Invalid input, closing calculator");
//                break;
//            }

                

                
           
//            double firstInput = operator.getLastInput();
//            
//            System.out.println("Enter operation (+, -, /, *)");
//            OUTER:
//            while (true) {
//                String operation = scanner.nextLine();
//                if (operation.equals("sqrt")) {
//                    double sqrt = operator.sqrt(operator.getLastResult());
//                    System.out.println(sqrt);
//                    break;
//                    
//                }
//                if (!(operation.equals("+")) && !(operation.equals("-")) && !(operation.equals("/")) && !(operation.equals("*")) && !(operation.equals("=")) && !(operation.equals("^"))) {
//                    System.out.println("Unsupported operation, try again.");
//                } else {
//                    System.out.println("Enter the second number.");
//                    operator.setLastInput(Double.parseDouble(scanner.nextLine()));
//                    double secondInput = operator.getLastInput();
//                
//                    switch (operation) {
//                        case "+":
//                            double sum = operator.sum(operator.getLastResult(), secondInput);
//                            System.out.println(sum);
//                            break OUTER;
//                        case "-":
//                            double subs = operator.substraction(operator.getLastResult(), secondInput);
//                            System.out.println(subs);
//                            break OUTER;
//                        case "/":
//                            double divi = operator.division(operator.getLastResult(), secondInput);
//                            System.out.println(divi);
//                            break OUTER;
//                        case "*":
//                            double multi = operator.multiplication(operator.getLastResult(), secondInput);
//                            System.out.println(multi);
//                            break OUTER;
//                        case "=":
//                            double equ = operator.equals();
//                            System.out.println(equ);
//                            break OUTER;
//                        case "^":
//                            double power = operator.power(operator.getLastResult(), secondInput);
//                            System.out.println(power);
//                            break OUTER;
//                        default:
//                            break;
//                    }
//                }
//            }
//        }
//    }   

//try {
//                String exitOrNumber = scanner.nextLine();
//                if (exitOrNumber.equals("e")) {
//                    System.out.println("Thank you for using the calculator.");
//                    break;
//                }
//                double x = Double.parseDouble(exitOrNumber);
//                operator.setLastInput(Double.parseDouble(exitOrNumber));
//                operator.setLastResult(Double.parseDouble(exitOrNumber));
//            } catch (NumberFormatException ex) {
//                System.out.println("Invalid input, closing calculator");
//                break;
//            }