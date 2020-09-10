package com.egidijus.app;
//13. Write a Java program to print the area and perimeter of a rectangle.
// Go to the editor
//Test Data:
//Width = 5.5 Height = 8.5

public class uzduotis13 {
    public static void main(String[] args){
        float width = (float) 5.5;
        float height = (float) 8.5;
        System.out.println("plots - 5.5, aukstis - 8.5 plotas =" + (width * height) );
        System.out.println("plots - 5.5, aukstis - 8.5 perimetras =" + (2*(width + height) ));
    }
}
