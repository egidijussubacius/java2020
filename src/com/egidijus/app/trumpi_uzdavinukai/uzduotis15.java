package com.egidijus.app;
//15. Write a Java program to swap two variables.
public class uzduotis15 {
    public static void main(String[] args) {
        int x = 5, y = 10;
        x = x ^ y ^ (y = x);
        System.out.println("New values of x and y are "+ x + ", " + y);

        //Here's a method to swap two variables in java in just one line using bitwise XOR(^) operator.
    }


}
