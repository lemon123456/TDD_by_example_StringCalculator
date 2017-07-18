package com.tw;

public class StringCalculator {
    private final DelimiterParser delimiterParser = new DelimiterParser();
    private final NumberParser numberParser = new NumberParser();

    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        String delimiter = delimiterParser.parse(string);
        String[] numbers = numberParser.parse(string, delimiter);
        ensureNoNegatives(numbers);
        return sum(numbers);
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