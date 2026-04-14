package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        //Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String userFullName = scanner.nextLine();
        userFullName = userFullName.trim();
        String[] nameSplit = userFullName.split("\\s+"); // \\s is an escape character and "+" is one or more whitespace

        //If the user did not add middle name
        if (nameSplit.length == 2) {
            System.out.printf("First name: %s\n", nameSplit[0]);
            System.out.println("Middle name: ");
            System.out.printf("Last name: %s\n", nameSplit[1]);
        } else if ( nameSplit.length == 3) {
            System.out.printf("First name: %s\n", nameSplit[0]);
            System.out.printf("Middle name: %s\n", nameSplit[1]);
            System.out.printf("Last name: %s\n", nameSplit[2]);
        }
    }
}

