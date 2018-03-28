/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.laskin.Calculator;
import com.mycompany.laskin.Operator;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kakshoo
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    Operator operator;
    Calculator calculator;
    Scanner scanner;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculator = new Calculator();
        operator = new Operator();
        calculator.setScanner(scanner);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void scannerSetterGetterWorks() {
        Scanner scanner = new Scanner(System.in);
        calculator.setScanner(scanner);
        assertEquals(scanner, calculator.getScanner());
       
    }
    @Test
    public void operatorSetterGetterWorks() {
        Operator operator = new Operator();
        calculator.setOperator(operator);
        assertEquals(operator, calculator.getOperator());
    }
    @Test
    public void operatorNotNull() {
        assertNotNull(calculator.operator);
    }   
}
