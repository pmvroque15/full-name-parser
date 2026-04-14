package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        //Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String userFullName = scanner.nextLine();

        String[] nameSplit = userFullName.split(" ");

        System.out.printf("First name: %s\n", nameSplit[0]);
        System.out.printf("Middle name: %s\n", nameSplit[1]);
        System.out.printf("Last name: %s\n", nameSplit[2]);
    }
}

