package com.egidijus.app;

import java.awt.*;

//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
//Test Data
//Input a degree in Fahrenheit: 212
//Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius
public class datatype_uzd1 {
    public static void main (String[] args) {
        int far = 212;
      int celsius = (far-32)*5/9;
        System.out.println("Farenheit = 212F");
        System.out.println("Konvertuojame i Celsiujus = " + celsius);
    }
}
