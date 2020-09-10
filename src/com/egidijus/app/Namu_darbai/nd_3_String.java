package com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai;

public class nd_3_String {
    public static void main(String[] args){
        String newLine = System.getProperty("line.separator");

        System.out.println("Sveiki, Jonai" + newLine +  "kaip sekasi?");


        String Str = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        System.out.print("Atsakymas A) visi simboliai mažosiomis raidėmis :");
        System.out.println(Str.toLowerCase());

        String Str2 = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        System.out.print("Atsakymas B) visi simboliai didžiosiomis raidėmis :");
        System.out.println(Str.toUpperCase());

        System.out.println("Atsakymas C) pakeistos raidės iš 'o' į 'z' = " + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.".replace("o","z"));

        String str1 = new String("testinis stringas, kuris baigiasi zodziu elit");
        System.out.println("str1 - " + str1);

        boolean var1 = str1.endsWith("elit");
        System.out.println("str1 baigiasi žodžiu 'elit': "+ var1);

    }
}
