package com.tw;

public class StringCalculator {
    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        String delimiter = parseDelimiter(string);
        String[] numbers = parseNumbers(string, delimiter);
        ensureNoNegatives(numbers);
        int result = 0;
        for (String number : numbers) {
            result += Integer.valueOf(number);
        }
        return result;
    }

    private void ensureNoNegatives(String[] numbers) {
        for (String number : numbers) {
            if (Integer.valueOf(number) < 0) {
                throw new ArithmeticException("Negatives not allowed");
            }
        }
    }

    private String parseDelimiter(String string) {
        if (string.startsWith("//")) {
            return string.substring(2, 3);
        }
        return " ";
    }

    private String[] parseNumbers(String string, String delimiter) {
        String stringOfNumbers = string;
        if (string.startsWith("//")) {
            stringOfNumbers = string.substring(string.indexOf('\n') + 1);
        }
        return stringOfNumbers.replaceAll("\n", delimiter).split(delimiter);
    }
}