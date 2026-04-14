package com.pluralsight;

import java.util.Scanner;

public class Main {
    static void main() {
        //Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        //Declare and assign variables

        //Prompts
        //First Name
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String userFirstName = scanner.nextLine();
        userFirstName = userFirstName.trim();
        userFirstName = uppercasePolice(userFirstName);

        //Middle name:
        System.out.print("Middle name: ");
        String userMiddleName = scanner.nextLine();
        userMiddleName = userMiddleName.trim();
        userMiddleName = uppercasePolice(userMiddleName);

        //Last name:
        System.out.print("Last name: ");
        String userLastName = scanner.nextLine();
        userLastName = userLastName.trim();
        userLastName = uppercasePolice(userLastName);

        //Suffix
        System.out.print("Suffix: ");
        String userSuffix = scanner.nextLine();
        userSuffix = userSuffix.trim().toUpperCase();


        System.out.println(concatenateName(userFirstName, userMiddleName,userLastName,userSuffix));
    }
    //Create a method that concatenate all the string user input
    static String concatenateName(String firstName, String middleName, String lastName, String suffix) {

        String result = firstName + " " + middleName + " " + lastName;

        if (firstName.isEmpty()) {
            result = middleName + " " + lastName + ", " + suffix;
        } else if (middleName.isEmpty()) {
            result = firstName + " " + lastName + ", " + suffix;
        } else if (lastName.isEmpty()) {
            result = firstName + " " + middleName + ", " + suffix;
        }
        return result;
    }

    static String uppercasePolice(String name) {
        char firstLetter = name.charAt(0);
        char uppercaseChanger = Character.toUpperCase(firstLetter);
        String theRest = name.substring(1);

        return uppercaseChanger + theRest;
    }

}

