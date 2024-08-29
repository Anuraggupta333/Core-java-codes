package com.RegularExpression;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s");
        String [] splits = pattern.split("My name is anurag");
        for(String s : splits) {
            System.out.println(s);
        }
    }
}
