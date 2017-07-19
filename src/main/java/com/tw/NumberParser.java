package com.tw;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public NumberParser() {
    }

    public List<Integer> parse(String string, List<String> delimiters) {
        List<Integer> integers = new ArrayList<>();
        String stringOfNumbers = string;
        
        if (string.startsWith("//")) {
            stringOfNumbers = string.substring(string.indexOf('\n') + 1);
        }
        for (String delimiter : delimiters) {
            stringOfNumbers = stringOfNumbers.replaceAll(delimiter, delimiters.get(0));
        }
        String[] numbers = stringOfNumbers.replaceAll("\n", delimiters.get(0)).split(delimiters.get(0));
        for (String number : numbers) {
            integers.add(Integer.valueOf(number));
        }
        return integers;
    }
}