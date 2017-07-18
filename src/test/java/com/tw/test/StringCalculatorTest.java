package com.tw.test;

import com.tw.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void return_zero_when_input_is_empty() throws Exception {
        assertEquals(0, stringCalculator.calculate(""));
    }

    @Test
    public void return_number_when_input_has_one_number() throws Exception {
        assertEquals(1, stringCalculator.calculate("1"));
        assertEquals(3, stringCalculator.calculate("3"));
    }
}
