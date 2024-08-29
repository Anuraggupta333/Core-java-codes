package com.RegularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static void main(String[] args) {
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);

        String[] emails = {
                "user@example.com",
                "invalid-email",
                "another.user@domain.co",
                "user@domain"
        };

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
