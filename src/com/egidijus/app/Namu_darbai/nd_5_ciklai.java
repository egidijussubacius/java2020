package com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class nd_5_ciklai {
    public static void main(String[] args) throws IOException {

//        System.out.println("... while");
//        int counter = 5;
//        while (counter > 0) {
//            System.out.println(counter);
//            counter = counter - 1;
//        }




//infinity loop (while)
//        int i=10;
//        while(i>1)
//        {
//            System.out.println(i);
//            i++;
//        }




//        infity loop (for)
//        for (;;) {
//            // do something
//        }
//    }




        Scanner sc1 = new Scanner(System.in);
        String userInput = null;
        String key = "q";
        do {
            System.out.print("Prašome įvesti teisingą raidę ('q'): ");
            userInput = sc1.nextLine();
        } while (!userInput.equals(key));
        System.out.println("Simbolis sutapo");

        String string = "alus";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);


        Scanner input = new Scanner(System.in);
        System.out.print("Iveskite tekstą: ");
        String myString = input.next();



            // Creating array of string length
            char[] ch = new char[myString.length()];

            // Copy character by character into array
            for (int i = 0; i < myString.length(); i++) {
                ch[i] = myString.charAt(i);
//                System.out.println("check " + ch[i]);

            }
        int x1 = myString.length();
        for(x1 = myString.length(); x1 > 0 ; )
            // Printing content of array
            for (char c : ch) {
                System.out.println("--> "  + c  + "  -->  " + x1--);
            }

    }
}






