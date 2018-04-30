
package calculator.ui;

import calculator.logics.Operator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Luokka toimii sovelluksen moottorina, ja päätoiminnallisuus sekä käyttöliittymä rakentuvat täällä.
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
    
    
    /**
    * Metodi käynnistää sovelluksen.
    */
    public void startCalculator() {
        
        //Käynnistys
        
        System.out.println("Welcome to Calculator.app!");
        String output = "";
        double firstInput = 0;
        double secondInput = 0;
        while (true) {
            System.out.println("What would you like to calculate?");
            System.out.println("1: Basic operations");
            System.out.println("2: Trigonometric operations");
            System.out.println("3: Powers");
            System.out.println("4: Print out your calculation history");
            System.out.println("5: Clear your calculation history");
            System.out.println("e: Exit");
            System.out.println("");
            String command = scanner.nextLine();
            
            
            if (command.equals("1")) {
                
                System.out.println("Enter operation (+, -, /, *)");
                
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
                    output = firstInput + "+" + secondInput + " = " + operator.getLastResult();
                }
                if (operator.getLastOperation().equals("-")) {
                    operator.substraction(firstInput, secondInput);
                    output = firstInput + "-" + secondInput + " = " + operator.getLastResult();
                }
                if (operator.getLastOperation().equals("/")) {
                    operator.division(firstInput, secondInput);
                    output = firstInput + "/" + secondInput + " = " + operator.getLastResult();
                }
                if (operator.getLastOperation().equals("*")) {
                    operator.multiplication(firstInput, secondInput);
                    output = firstInput + "*" + secondInput + " = " + operator.getLastResult();
                }
                System.out.println(output);
                System.out.println("");
                try (FileWriter fw = new FileWriter("operations.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
                
                    out.println(output);
                } catch (IOException e) {
                    System.out.println("The application encountered an error");
                }
            }
            
            
            if (command.equals("2")) {
                System.out.println("Enter operation (sin, cos, tan)");
                
                while (true) {
                    String operation = scanner.nextLine();
                    if (!(operation.equals("sin")) && !(operation.equals("cos")) && !(operation.equals("tan"))) {
                        System.out.println("Unsupported operation, try again.");
                    } else {
                        this.operator.setLastOperation(operation);
                        break;
                    }
                }
                System.out.println("Enter a number or enter 'ans' to use last result.");
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
                if (operator.getLastOperation().equals("sin")) {
                    operator.sin(firstInput);
                    output = "sin(" + firstInput + ") = " +  operator.getLastResult();
                }
                if (operator.getLastOperation().equals("cos")) {
                    operator.cos(firstInput);
                    output = "cos(" + firstInput + ") = " +  operator.getLastResult();
                }
                if (operator.getLastOperation().equals("tan")) {
                    operator.tan(firstInput);
                    output = "tan(" + firstInput + ") = " +  operator.getLastResult();
                }
                System.out.println(output);
                System.out.println("");
                try (FileWriter fw = new FileWriter("operations.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
                
                    out.println(output);
                } catch (IOException e) {
                    System.out.println("The application encountered an error");
                }
            }

            if (command.equals("3")) {

                System.out.println("Enter a number you'd like to raise to a power, or enter 'ans' to use last result.");
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
                System.out.println("Enter the power you would like your last input to be raised to, or enter 'ans' to use last result as the power.");
                
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
                operator.power(firstInput, secondInput);
                output = firstInput + " to the power of " + secondInput + " = " + operator.getLastResult();
                System.out.println(output);
                System.out.println("");
                try (FileWriter fw = new FileWriter("operations.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
                
                    out.println(output);
                } catch (IOException e) {
                    System.out.println("The application encountered an error");
                }
            }
            
            if (command.equals("4")) {
                
                try (FileWriter fw = new FileWriter("operations.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
                
                } catch (IOException e) {
                    System.out.println("ERROR WHILE CREATING FILE");
                }
                
                ArrayList<String> lines = new ArrayList<>();

                try {
                    Files.lines(Paths.get("operations.txt")).forEach(line -> lines.add(line));
                } catch (Exception e) {
                    System.out.println("ERROR WHILE READING FILE");
                }
                int linesMax = lines.size();
                int linesInt = 0;
                System.out.println("How many lines would you like to print? The maximum is " + linesMax + ". Press enter for full history.");
                String linesInput = scanner.nextLine();
                if (linesInput.equals("")) {
                    lines.stream().forEach(t -> System.out.println(t));
                } else {
                    try {
                        linesInt = Integer.parseInt(linesInput);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid input, closing calculator");
                        break;
                    }
                    if (linesInt > linesMax) {
                        System.out.println("Invalid input, closing calculator");
                        break;
                    }
                    int i = 0;
                    while (i < linesInt) {
                        System.out.println(lines.get(i));
                        i++;
                    }
                }
                System.out.println("");
            }
            
            if (command.equals("5")) {
                if (Paths.get("Operations.txt") != null) {
                    try {
                        PrintWriter writer = new PrintWriter("Operations.txt");
                        writer.print("");
                        writer.close();
                    } catch (Exception e) {
                        System.out.println("The application encountered an error");
                    }
                }
                System.out.println("Your calculation history has been cleared.");
            }
            
            if (command.equals("e")) {
                System.out.println("Thank you for using the calculator.");
                break;
            }
        }
    }
}