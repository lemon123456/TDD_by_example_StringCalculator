package com.tw;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private final DelimiterParser delimiterParser = new DelimiterParser();
    private final NumberParser numberParser = new NumberParser();

    public StringCalculator() {
    }

    public int calculate(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        List<String> delimiters = delimiterParser.parse(string);
        String[] numbers = numberParser.parse(string, delimiters);
        ensureNoNegatives(numbers);

        return sum(filterOutBigNumbers(numbers));
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

    private ArrayList<String> filterOutBigNumbers(String[] numbers) {
        ArrayList<String> filteredNumbers = new ArrayList<>();
        for (String number : numbers) {
            if (Integer.valueOf(number) < 1000) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    private int sum(ArrayList<String> numbers) {
        int result = 0;
        for (String number : numbers) {
            result += Integer.valueOf(number);
        }
        return result;
    }
}