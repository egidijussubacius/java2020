package com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai;

import java.util.Scanner;

public class nd_4_ciklai {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1;
        int num2 = 18;


        System.out.print("Įveskite savo amžių: ");
        num1 = kb.nextInt();

        while (num1 >= num2) {
            System.out.print("Galite balsuoti");
            break;

        }
        while (num2 > num1) {
            System.out.print("Negalite balsuoti");
            break;

        }
        System.out.println(" ");
        System.out.println("Patikriname ar galime balsuoti ir kartu kandidatuoti");
        Scanner amzius = new Scanner(System.in);
        int amz1;
        int amz2 = 18;
        int amz3 = 45;
        System.out.print("Įveskite savo amžių: ");
        amz1 = amzius.nextInt();
        if (amz1 < amz2) {
            System.out.println("Negalite balsuoti");
        } else if (amz1 >= amz2 && amz1 <= amz3) {
            System.out.println("Galite balsuoti");
        } else  {
            System.out.println("Galite balsuoti ir kandidatuoti");
        }




    }
}