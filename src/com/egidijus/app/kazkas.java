package com.egidijus.app;

import java.util.Arrays;
import java.util.Scanner;

public class kazkas {
    public static void main(String[] args) {
        // .... Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
        Scanner s = new Scanner(System.in);
        System.out.println("Įveskite norimo dydžio masyvą: ");
        // Jei naudojame nextLine() po nextInt(), tai po pastarojo reikia "suvalgyti" newline simbolį
        // ... kuris atsiranda paspaudus enter. s.nextLine() jį automatiškai suvalgo, todėl po jo nereikia
        // ... nereikia papildomo s.nextLine()
        int arrMasyvas = s.nextInt();
        s.nextLine();
//        System.out.println(arrMasyvas);
        String[] myArray = new String[arrMasyvas];
        System.out.println("Įveskite duomenis į masyvą. ( kiekvienas duomuo vis naujoje eilutėje) ");
        for (int a = 0; a < arrMasyvas; a++) {
            myArray[a] = s.nextLine();
        }
        System.out.println("Masyvas atrodo taip : " + Arrays.toString(myArray));
    }
}
