package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (UserRegistration.validateFirstName(firstName)) {
            System.out.println("First name is valid!");
        } else {
            System.out.println("Please enter a valid first name.");
        }
    }
}
