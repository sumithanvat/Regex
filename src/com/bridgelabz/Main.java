package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Last name: ");
        String LastName = scanner.nextLine();

        if (UserRegistration.validateLastName(LastName)) {
            System.out.println("Last name is valid!");
        } else {
            System.out.println("Please enter a valid Last name.");
        }
    }
}
