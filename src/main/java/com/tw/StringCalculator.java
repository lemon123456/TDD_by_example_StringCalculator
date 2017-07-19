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
        List<Integer> numbers = numberParser.parse(string, delimiters);
        ensureNoNegatives(numbers);

        return sum(filterOutBigNumbers(numbers));
    }

    private void ensureNoNegatives(List<Integer> numbers) {
        StringBuilder negatives = new StringBuilder();
        for (int number : numbers) {
            if (number < 0) {
                negatives.append(" ").append(number);
            }
        }
        if (negatives.length() > 0) {
            throw new ArithmeticException("Negatives not allowed:" + negatives);
        }
    }

    private List<Integer> filterOutBigNumbers(List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number < 1000) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }

    private int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
}