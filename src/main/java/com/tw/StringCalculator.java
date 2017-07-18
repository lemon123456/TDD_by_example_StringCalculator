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
        return sum(numbers);
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

    private void ensureNoNegatives(String[] numbers) {
        StringBuilder negatives = new StringBuilder();
        for (String number : numbers) {
            if (Integer.valueOf(number) < 0) {
                negatives.append(" ").append(number);
            }
        }
        if (negatives.length() > 0) {
            throw new ArithmeticException("Negatives not allowed:" + negatives);
        }
    }

    private int sum(String[] numbers) {
        int result = 0;
        for (String number : numbers) {
            result += Integer.valueOf(number);
        }
        return result;
    }
}