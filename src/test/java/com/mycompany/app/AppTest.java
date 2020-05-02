package com.mycompany.app;


import org.junit.*;

public class AppTest {
    
    private App calculator;
    
    @Before
    public void setUp() {
        calculator = new App();
    }

    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        calculator.divide(a, b);
    }
}





// import static org.junit.Assert.assertTrue;

// import org.junit.Test;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         assertTrue( true );
//     }
// }
