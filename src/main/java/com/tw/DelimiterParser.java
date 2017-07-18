package com.tw;

import java.util.Arrays;
import java.util.List;

public class DelimiterParser {
    public DelimiterParser() {
    }

    public List<String> parse(String string) {
        if (string.startsWith("//")) {
            if (string.contains("[")) {
                return Arrays.asList(string.substring(3, 4));
            }
            return Arrays.asList(string.substring(2, 3));
        }
        return Arrays.asList(" ");
    }
}