package com.tw;

public class StringCalculator {
    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        int result = 0;
        String[] numbers = string.split(" ");
        for (String number : numbers) {
            result += Integer.valueOf(number);
        }
        return result;
    }
}