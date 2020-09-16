package com.egidijus.app.Namu_darbai;

// klasės darbas yra    folderyje.   C:\Users\Egidijus\Desktop\java2020\src\com\egidijus\app
// pavadinimas  "klases_darbas09_16".
import java.util.Arrays;
import java.util.Scanner;

public class nd_8_class {
    public static void main(String[] args) {

        Tests tests = new Tests();

        tests.displayInfo();

    }


}

class Tests {

    private String name;


    Scanner userinput = new Scanner(System.in);

    public Tests() {
        this.name = name;
    }

    public void setName() {
        System.out.println("Įveskite savo vardą: ");
        name = userinput.next();
    }

    public String getName() {

        return name;
    }

    public void displayInfo() {
        setName();
        System.out.println("Jūsų vardas yra --->  " + this.getName());
    }

    public static void main(String[] args) {

        Tests test = new Tests();
        test.displayInfo();

    }


}