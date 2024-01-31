package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println(generateFullName());
    }
    public static String generateFullName() {
        Scanner userInput = new Scanner(System.in);

        //variables
        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String fullName;

        //input
        System.out.println("Please enter your name");
        System.out.println("First Name:");
        firstName = userInput.nextLine();
        System.out.println("Middle Name:");
        middleName = userInput.nextLine();
        System.out.println("Last Name:");
        lastName = userInput.nextLine();
        System.out.println("Suffix:");
        suffix = userInput.nextLine();

        fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        // find any double spaces and replace with single spaces
        fullName = fullName.replace("  "," ");
        // trim the ends
        return fullName.trim();
    }
}
