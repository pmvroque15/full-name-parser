package com.pluralsight;

import java.util.Scanner;

public class Main {
    static void main() {
        //Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String userFullName = scanner.nextLine();
//        String userFullName = "Joe Bob Smith, PhD";
        userFullName = userFullName.trim();
        String[] nameSplit = userFullName.split(" ");
        boolean comma = userFullName.contains(",");
        int commaIndex = userFullName.indexOf(",");

        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        if (nameSplit.length == 1) {
            firstName = nameSplit[0];
        } else if (nameSplit.length == 2) {
            firstName = nameSplit[0];
            lastName = nameSplit[1];
        } else if (nameSplit.length == 3) {
            firstName = nameSplit[0];
            if (nameSplit[1].contains(",")) {
                middleName = "";
                lastName = nameSplit[1];
                lastName = lastName.replace(",","");
                suffix = nameSplit[2];
            }
            else {
                middleName = nameSplit[1];
                lastName = nameSplit[2];
                suffix = "";
            }
        } else if (nameSplit.length >= 4) {
            firstName = nameSplit[0];
            middleName = nameSplit[1];
            lastName = nameSplit[2];
            lastName = lastName.replace(",","");
            suffix = nameSplit[3];
        }

        System.out.printf("First name: %s\n", firstName);
        System.out.printf("Middle name: %s\n", middleName);
        System.out.printf("Last name: %s\n", lastName);
        System.out.printf("Suffix: %s\n", suffix);
    }
}

