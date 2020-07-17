package lessons31.hw_task_2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;


public class CalculatorTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sum() {
       Calculator calc = new Calculator(0,0);
       int actual = calc.sum(5,4);
       int expect = 9;
       assertEquals(expect,actual);
    }

    @Test
    public void subtraction() {
        Calculator calc = new Calculator(0,0);
        int actual = calc.subtraction(1,9);
        int expect = -8;
        assertEquals(expect,actual);

    }

    @Test
    public void multiplication() {
        Calculator calc = new Calculator(0,0);
        int actual = calc.multiplication(5,4);
        int expect = 20;
        assertEquals(expect, actual);
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator(0,0);
        double actual = calculator.division(3,2);
        double expect =  1.5;
       assertEquals(expect,actual,0.0);
    }

    @Test
    public void maxNumber() {
        Calculator calculator = new Calculator(0,0);
        int actual = calculator.maxNumber(51,14);
        int expect = 51;
        assertEquals(expect,actual);
    }

    @Test
    public void minNumber() {
        Calculator calculator = new Calculator(0,0);
        int actual = calculator.minNumber(37,45);
        int expect = 37;
        assertEquals(expect,actual);
    }

    @Test
    public void percentNumber() {
        Calculator calculator = new Calculator(0,0);
        double actual = calculator.percentNumber(2,5);
        double expected = 40.0;
    }

    @Test
    public void powNumber() {
        Calculator calculator = new Calculator(0,0);
        int actual = calculator.powNumber(2,3);
        int expect = 8;
        assertEquals(expect,actual);
    }
}