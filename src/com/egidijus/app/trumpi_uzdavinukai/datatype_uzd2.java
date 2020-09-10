package com.egidijus.app;
//2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
//Note: One inch is 0.0254 meter.
//Test Data
//Input a value for inch: 1000
//Expected Output :
//1000.0 inch is 25.4 meters
public class datatype_uzd2 {

    public static void main(String[] args) {
        double incas = 0.0254;
        int kint = 1000;
        float met = (float) (kint * incas);
        System.out.println(met);

    }
}
