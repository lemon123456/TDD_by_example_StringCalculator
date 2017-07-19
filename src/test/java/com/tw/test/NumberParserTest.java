package com.tw.test;

import com.tw.NumberParser;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class NumberParserTest {

    private NumberParser numberParser = new NumberParser();

    @Test
    public void test_parse_string_has_single_delimiter() throws Exception {
        assertArrayEquals(new String[]{"1", "2"}, numberParser.parse("//delimiters-line\n1;2", Arrays.asList(";")));
    }

    @Test
    public void test_parse_string_has_long_delimiter() throws Exception {
        assertArrayEquals(new String[]{"1", "2"}, numberParser.parse("//delimiters-line\n1;;2", Arrays.asList(";;")));
    }

    @Test
    public void test_parse_string_has_multiple_delimiters() throws Exception {
        assertArrayEquals(new String[]{"1", "2", "3"}, numberParser.parse("//delimiters-line\n1;;2%%%3", Arrays.asList(";;", "%%%")));
    }
}
