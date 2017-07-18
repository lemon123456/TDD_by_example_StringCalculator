package com.tw;

public class StringCalculator {
    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        String[] numbers = string.split(" ");
        if (numbers.length == 1) {
            return Integer.valueOf(string);
        }
        return Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]);
    }
}