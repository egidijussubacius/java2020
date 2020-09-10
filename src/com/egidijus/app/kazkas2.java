package com.egidijus.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kazkas2 {

    public static void main(String[] args) {
        System.out.println("Įveskite kiek norėsite elementų masyve");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /* Declaring array of n elements, the value
         * of n is provided by the user
         */
        double[] arr = new double[n];
        double total = 0;
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Įveskite nr."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }



        double average = total / arr.length;




        for( double num : arr) {
            sum = sum+num;
        }
        System.out.println("Masyve esančių elementų suma: "+sum);

        System.out.format("Masyve esančių elementų vidurkis: %.3f", average);
    }

    }



