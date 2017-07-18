package com.tw;

public class DelimiterParser {
    public DelimiterParser() {
    }

    public String parse(String string) {
        if (string.startsWith("//")) {
            if (string.contains("[")) {
                return string.substring(3, 4);
            }
            return string.substring(2, 3);
        }
        return " ";
    }
}