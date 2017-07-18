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

        String string1 = string.substring(string.indexOf("["), string.lastIndexOf("]") + 1);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i < string1.length(); i+=3) {
            result.add(string1.substring(i, i + 1));
        }
        return result;
    }
}