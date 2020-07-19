package lessons31.hw_task_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.stream;
import static junit.framework.Assert.assertEquals;

public class ArrayClassTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sumArray() {
        ArrayClass arrayClass = new ArrayClass();
        int[] array = new int[]{2, 3};
        int actual = stream(array).sum();
        int expected = 5;
        assertEquals(expected,actual);

    }

    @Test
    public void averageArray() {
        ArrayClass arrayClass = new ArrayClass();
        int[] array = new int[]{2, 3};
        double actual = stream(array).average().orElse(Double.NaN);
        double expected = 2.5 ;
        org.junit.Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void maxArray() {
        ArrayClass arrayClass = new ArrayClass();
        int[] array = new int[]{2, 3};
        int actual = stream(array).max().getAsInt();
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void minArray() {
        ArrayClass arrayClass = new ArrayClass();
        int[] array = new int[]{2, 3};
        int actual = stream(array).min().getAsInt();
        int expected = 2;
        assertEquals(expected,actual);

    }
}