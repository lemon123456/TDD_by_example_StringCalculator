package com.tw.test;

import com.tw.DelimiterParser;
import com.tw.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DelimiterParserTest {
    @Test
    public void parse_single_delimiter_with_simple_format() throws Exception {
        assertEquals(";", new DelimiterParser().parse("//;\n1;2"));
    }

    @Test
    public void parse_single_delimiter_with_default_format() throws Exception {
        assertEquals(";", new DelimiterParser().parse("//[;]\n1;2"));
    }

}
