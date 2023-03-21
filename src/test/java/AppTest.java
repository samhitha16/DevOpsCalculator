// package samhitha;

// import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is the TEST document for the Calculator.java class
 */


public class AppTest {

//    Calculator calculator;

    double delta = 1e-15;
    @Test
    public void testing_sum() {
        double expectedValue = 5;
        double actualValue = Calculator.sum(2, 3);
        assertEquals("This should evaluate to 5", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_subtract() {
        double expectedValue = 10;
        double actualValue = Calculator.subtract(15, 5);
        assertEquals("This should evaluate to 10", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_divide() {
        double expectedValue = 10;
        double actualValue = Calculator.divide(20, 2);
        assertEquals("This should evaluate to 10", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_divide_2() {
        double expectedValue = -1;
        double actualValue = Calculator.divide(20, 0);
        assertEquals("This should evaluate to an error: -1", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_multiply() {
        double expectedValue = 100;
        double actualValue = Calculator.multiply(50, 2);
        assertEquals("This should evaluate to 100", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_square() {
        double expectedValue = 4;
        double actualValue = Calculator.square(2);
        assertEquals("This should evaluate to 4", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_squareRoot() {
        double expectedValue = 2;
        double actualValue = Calculator.squareRoot(4);
        assertEquals("This should evaluate to 2", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_Exponent() {
        double expectedValue = 1000000;
        double actualValue = Calculator.Exponent(100, 3);
        assertEquals("This should evaluate to 1000", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_naturalLogarithm() {
        double expectedValue = 2.1972245773362196;
        double actualValue = Calculator.naturalLogarithm(9);
        assertEquals("This should evaluate to 2.1972245773362196", expectedValue, actualValue, delta);
    }

    @Test
    public void testing_factorial() {
        double expectedValue = 24;
        double actualValue = Calculator.factorial(4);
        assertEquals("This should evaluate to 24", expectedValue, actualValue, delta);
    }

}
/**
 * Unit test for simple App.
 */

