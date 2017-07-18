package com.tw;

public class StringCalculator {
    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(string);
    }
}