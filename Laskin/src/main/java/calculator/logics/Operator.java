
package calculator.logics;
/**
 * Luokka tarjoaa metodeja laskutoimitusten tekemiseen sekä inputtejen ja outputtejen säilömiseen.
 */
public class Operator {
    
    private double lastInput;
    private double lastResult;
    private String lastOperation;
    private double firstInput;
    private double secondInput;
    
    public Operator() {
        this.lastInput = 0;
        this.lastResult = 0;
        this.lastOperation = "";
        this.firstInput = 0;
        this.secondInput = 0;
        
        
    }

    public double getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(double secondInput) {
        this.secondInput = secondInput;
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
    
    
    /**
    * Summaa parametreina annetut luvut ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param firstNumber käyttäjän antama syöte
    * @param secondNumber käyttäjän antama syöte
    * @return tulos
    */
    public double sum(double firstNumber, double secondNumber) {
        lastInput = secondNumber;
        lastResult = (firstNumber + secondNumber);
        return lastResult;
    }
    /**
    * Vähentää parametreina annetut luvut toisistaan ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param firstNumber käyttäjän antama syöte
    * @param secondNumber käyttäjän antama syöte
    * @return tulos
    */
    public double substraction(double firstNumber, double secondNumber) {
        lastInput = secondNumber;
        lastResult = firstNumber - secondNumber;
        return lastResult;
    }
    /**
    * Jakaa parametreina annetun luvun toisella luvulla ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param firstNumber käyttäjän antama syöte 
    * @param secondNumber käyttäjän antama syöte
    * @return tulos
    */
    public double division(double firstNumber, double secondNumber) {
        lastInput = secondNumber;
        lastResult = firstNumber / secondNumber;
        return lastResult;
    }
    /**
    * Kertoo parametreina annetut luvut keskenään ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param firstNumber käyttäjän antama syöte
    * @param secondNumber käyttäjän antama syöte
    * @return tulos
    */
    public double multiplication(double firstNumber, double secondNumber) {
        lastInput = secondNumber;
        lastResult = firstNumber * secondNumber;
        return lastResult;
    }
    /**
    * Korottaa parametrina annetun luvun potenssiin ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param firstNumber käyttäjän antama syöte
    * @param secondNumber käyttäjän antama syöte
    * @return tulos
    */
    public double power(double firstNumber, double secondNumber) {
        lastInput = secondNumber;
        lastResult = Math.pow(firstNumber, secondNumber);
        return lastResult;
    }
    /**
    * Laskee annetun luvun neliöjuuren ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param number käyttäjän antama syöte
    * @return tulos
    */
    public double sqrt(double number) {
        lastInput = number;
        lastResult = Math.sqrt(number);
        return lastResult;
    }
    /**
    * Laskee annetun luvun sinin ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param number käyttäjän antama syöte
    * @return tulos
    */
    public double sin(double number) {
        lastInput = number;
        lastResult = Math.sin(number);
        return lastResult;
    }
    /**
    * Laskee annetun luvun cosinin ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param number käyttäjän antama syöte
    * @return tulos
    */
    public double cos(double number) {
        lastInput = number;
        lastResult = Math.cos(number);
        return lastResult;
    }
    /**
    * Laskee annetun luvun tangentin ja tallettaa tuloksen myöhempää käyttöä varten.
    * @param number käyttäjän antama syöte
    * @return tulos
    */
    public double tan(double number) {
        lastInput = number;
        lastResult = Math.tan(number);
        return lastResult;
    }
    public double arcsin(double number) {
        lastInput = number;
        lastResult = Math.asin(number);
        return lastResult;
    }
    public double arccos(double number) {
        lastInput = number;
        lastResult = Math.acos(number);
        return lastResult;
    }
    public double arctan(double number) {
        lastInput = number;
        lastResult = Math.atan(number);
        return lastResult;
    }
}
