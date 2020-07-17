package lessons31.hw_task_1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorFractionsTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sumFractions() {
        CalculatorFractions calculatorFractions = new CalculatorFractions();
        double actual = calculatorFractions.sumFractions ( 0.85, 0.15);
        double expected = 1.0;
        assertEquals(expected,actual,0.0);

    }

    @Test
    public void subtractionFractions() {
        CalculatorFractions calculatorFractions = new CalculatorFractions();
        double actual = calculatorFractions.subtractionFractions(3.0, 0.1);
        double expected = 2.9;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void divisionFractions() {
        CalculatorFractions calculatorFractions = new CalculatorFractions();
        double actual = calculatorFractions.divisionFractions(0.03, 0.1);
        double expected = 0.3;
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void multiplicationFractions() {
        CalculatorFractions calculatorFractions = new CalculatorFractions();
        double actual = calculatorFractions.multiplicationFractions(0.3, 0.1);
        double expected = 0.03;
        assertEquals(expected,actual,0.0);
    }

}

