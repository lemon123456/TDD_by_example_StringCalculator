package com.tw;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DelimiterParser {
    public DelimiterParser() {
    }

    public List<String> parse(String string) {
        if (!string.startsWith("//")) {
            return Collections.singletonList(" ");
        }
        if (!string.contains("[")) {
            return Collections.singletonList(string.substring(2, 3));
        }

        String delimitersString = string.substring(string.indexOf("["), string.lastIndexOf("]") + 1);
        ArrayList<String> result = new ArrayList<>();

        for (String delimiterString : delimitersString.split("\\[")) {
            if (delimiterString.isEmpty()) {
                continue;
            }
            result.add(delimiterString.substring(0, delimiterString.length() - 1));
        }
        return result;
    }
}