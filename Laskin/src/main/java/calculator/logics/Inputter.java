/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.logics;

import java.util.Scanner;

/**
 *
 * @author Kakshoo
 */
public class Inputter {
    
    private Scanner scanner;
    private Double firstInput;
    private Double secondInput;
    public Operator operator;
    
    public Inputter() {
        this.scanner = new Scanner(System.in);
    }
    
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
    public String chooseBasicOperation() {
        String operation;
        while (true) {
            operation = scanner.nextLine();
            if (!(operation.equals("+")) && !(operation.equals("-")) && !(operation.equals("/")) && !(operation.equals("*"))) {
                System.out.println("Unsupported operation, try again.");
            } else {
                break;
            }
        }   
        return operation;
    }
    
    public String chooseTrigonometricOperation() {
        String operation;
        while (true) {
            operation = scanner.nextLine();
            if (!(operation.equals("sin")) && !(operation.equals("cos")) && !(operation.equals("tan"))) {
                System.out.println("Unsupported operation, try again.");
            } else {
                this.operator.setLastOperation(operation);
                break;
            }
        }
        return operation;
    }
    
    public boolean chooseFirstInput() {
        String input = scanner.nextLine();
        if (input.equals("ans")) {
            operator.setFirstInput(operator.getLastResult());
            this.firstInput = operator.getLastResult();
            return true;
        } else {
            try {
                this.firstInput = Double.parseDouble(input);
                operator.setFirstInput(this.firstInput);
                return true;
                        
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, closing calculator");
                return false;
            }
        }   
    }
    
    public boolean chooseSecondInput() {
        String input = scanner.nextLine();
        if (input.equals("ans")) {
            operator.setSecondInput(operator.getLastResult());
            this.secondInput = operator.getLastResult();
            return true;
        } else {
            try {
                this.secondInput = Double.parseDouble(input);
                operator.setSecondInput(this.secondInput);
                return true;
                        
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, closing calculator");
                return false;
            }
        }   
    }
}
