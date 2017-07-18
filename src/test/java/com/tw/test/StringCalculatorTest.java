package com.tw.test;

import com.tw.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void test_when_input_is_empty() throws Exception {
        assertEquals(0, stringCalculator.calculate(""));
    }
}
