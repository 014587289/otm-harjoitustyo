/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.laskin.Calculator;
import com.mycompany.laskin.Operator;
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
public class OperatorTest {
    
    public OperatorTest() {
    }
    Operator operator = new Operator();
    Calculator calculator;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculator = new Calculator();
        calculator.setOperator(operator);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void lastInputZero() {
        double input = operator.getLastInput();
        assertEquals(0, Double.doubleToLongBits(input));
    }
    public void lastResultZero() {
        double result = operator.getLastResult();
        assertEquals(0, Double.doubleToLongBits(result));
    }
    @Test
    public void resultSetterWorks() {
        operator.setLastResult(3);
        assertEquals(Double.doubleToLongBits(3), Double.doubleToLongBits(operator.getLastResult()));
    }
    @Test
    public void inputSetterWorks() {
        operator.setLastInput(3);
        assertEquals(Double.doubleToLongBits(3), Double.doubleToLongBits(operator.getLastInput()));
    }
    
    @Test
    public void substractionWorks() {
        assertEquals(Double.doubleToLongBits(7), Double.doubleToLongBits(operator.substraction(10, 3)));
    }
    @Test
    public void divisionWorks() {
        assertEquals(Double.doubleToLongBits(7), Double.doubleToLongBits(operator.division(14, 2)));
    }
    @Test
    public void multiplicationWorks() {
        assertEquals(Double.doubleToLongBits(7), Double.doubleToLongBits(operator.multiplication(2, 3.5)));
    }
    @Test
    public void equalWorks() {
        operator.sum(3, 4);
        assertEquals(Double.doubleToLongBits(7), Double.doubleToLongBits(operator.getLastResult()));
    }
    @Test
    public void powerWorks() {
        operator.power(3, 2);
        assertEquals(Double.doubleToLongBits(9), Double.doubleToLongBits(operator.getLastResult()));
    }

}
