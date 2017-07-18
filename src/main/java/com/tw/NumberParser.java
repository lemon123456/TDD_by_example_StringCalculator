package com.tw;

public class NumberParser {
    public NumberParser() {
    }

    String[] parse(String string, String delimiter) {
        String stringOfNumbers = string;
        if (string.startsWith("//")) {
            stringOfNumbers = string.substring(string.indexOf('\n') + 1);
        }
        return stringOfNumbers.replaceAll("\n", delimiter).split(delimiter);
    }
}