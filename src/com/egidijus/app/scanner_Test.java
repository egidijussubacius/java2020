package com.egidijus.app;

import java.util.Scanner;

public class scanner_Test {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String pasw = "pirmas";
        String userInput = null;
        do {
            System.out.println("enter pasw");
            userInput = sc.nextLine();
        } while (!userInput.equals(pasw));
        System.out.println("You are logged in");
    }
}
