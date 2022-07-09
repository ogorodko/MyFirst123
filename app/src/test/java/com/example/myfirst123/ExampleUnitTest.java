package com.example.myfirst123;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect()
    {
        Calculator calculator=new Calculator();
        assertEquals(4, calculator.Add(2, 2),0.1);
        assertEquals(-1, calculator.Sub(2, 3),0.1);
        assertEquals(7, calculator.Add(5, 2),0.1);
    }
}