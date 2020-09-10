package com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai;

import java.util.Scanner;

//Parašykite programą, kuri išspausdina liekaną kai daliname 5 iš dviejų. Panaudokite
//liekanos operatorių (%).
public class nd_2_operatoriai {

    public static void main(String[] args){
        int pirmas = 5;
        int antras = 2;
        System.out.println("Atsakymas = "+ pirmas % antras);

        //2. Parašykite programą, kuri išspausdina rezultatą dalybos veiksmo 2 / 0. Kas nutinka?

        int vienas = 2;
        int du = 1;
        System.out.println(vienas / du);
        // dalyba iš nulio. sustoja programa.
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai.nd_2_operatoriai.main(nd_2_operatoriai.java:18)


        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // kas bus išspausdinta? //manau, kad bus klaida, nes x 'int' nera priskirta.
        //pries x pridejus 'int' pirma salyga bus teisinga.
        System.out.println(x <= y && y > 5); // kas bus išspausdinta? 'False'
        System.out.println("abc" instanceof String); // kas bus išspausdinta? - klaida, ne tokios kabutes.


    }




}
