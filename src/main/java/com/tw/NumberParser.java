package com.tw;

import java.util.List;

public class NumberParser {
    public NumberParser() {
    }

    public String[] parse(String string, List<String> delimiters) {
        String stringOfNumbers = string;
        if (string.startsWith("//")) {
            stringOfNumbers = string.substring(string.indexOf('\n') + 1);
        }
        for (String delimiter : delimiters) {
            stringOfNumbers = stringOfNumbers.replaceAll(delimiter, delimiters.get(0));
        }
        return stringOfNumbers.replaceAll("\n", delimiters.get(0)).split(delimiters.get(0));
    }
}