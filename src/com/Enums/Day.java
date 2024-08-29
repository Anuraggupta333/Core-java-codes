package com.Enums;

public enum Day {
    // Enum constants representing the days of the week
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args) {
        // Iterate over all constants in the Day enum
        for (Day day : Day.values()) {
            // Use a switch statement to provide custom messages for specific days
            switch (day) {
                case MONDAY:
                    // Special message for Monday
                    System.out.println(day + " : Start of the work week!");
                    break;
                case FRIDAY:
                    // Special message for Friday
                    System.out.println(day + " : End of the work week!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    // Messages for the weekend days
                    System.out.println(day + " : It's the weekend!");
                    break;
                default:
                    // Default message for all other days (Tuesday through Thursday)
                    System.out.println(day + " : It's a regular day.");
                    break;
            }
        }
    }
}
