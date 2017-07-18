package com.tw;

public class DelimiterParser {
    public DelimiterParser() {
    }

    public String parse(String string) {
        if (string.startsWith("//")) {
            return string.substring(2, 3);
        }
        return " ";
    }
}