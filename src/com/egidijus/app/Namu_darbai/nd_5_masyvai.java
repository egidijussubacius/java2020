package com.egidijus.app.Namu_darbai.Primityvus_duomenu_tipai;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Scanner;

public class nd_5_masyvai {
    public static void main(String[] args) {

  System.out.println("Įveskite kiek norėsite elementų masyve: ");
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


        System.out.println("");

        System.out.println("Rikiavimas (bubble sort algoritmas)");
        // int[] intArr6 = { 4, 1, 2, 0, 6, 3 }; // rezultatas turėtų būti: 0, 1, 2, 4, 6
        double[] arr2 = arr;
        System.out.println("Prieš rikiavimą: " + Arrays.toString(arr));
        int iterationCounter = 0, swapCounter = 0;

        for (int k = 0; k < arr2.length - 1; k++) {
            for(int kidx = 0; kidx < arr2.length - 1 - k; kidx++) {
                iterationCounter++;
                if(arr2[kidx] > arr2[kidx + 1]){
                    swapCounter++;
                    double temporary = arr2[kidx + 1];
                    arr2[kidx + 1] = arr2[kidx];
                    arr2[kidx] = temporary;
                }
            }
        }

        System.out.println("Iteracijų : " + iterationCounter);
        System.out.println("Apkeitimų vietomis : " + swapCounter);
        System.out.println("Po rikiavimo: " + Arrays.toString(arr));
}
}







































































//    public static void main(String[] args) {
//        System.out.println(" Masyvų namų darbas");
//        //Sukurkite masyvą ir išspausdinkite visus jo narius 3-jų ciklų pagalba.
//        int[] anArray;
//
//        anArray = new int[3];
//
//        // assign a value to each array element and print
//        for (int i = 0; i < anArray.length; i++) {
//            anArray[i] = i;
//            System.out.print(anArray[i] + " ");
//        }
//        System.out.println();
//
//        //Taip kaip #1, bet masyvo dydis turi būti nurodomas programos naudotojo, konsolėje.
//        // .... Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
//        Scanner s = new Scanner(System.in);
//        System.out.println("Įveskite norimo dydžio masyvą: ");
//        // Jei naudojame nextLine() po nextInt(), tai po pastarojo reikia "suvalgyti" newline simbolį
//        // ... kuris atsiranda paspaudus enter. s.nextLine() jį automatiškai suvalgo, todėl po jo nereikia
//        // ... nereikia papildomo s.nextLine()
//        int arrMasyvas = s.nextInt();
//        s.nextLine();
////        System.out.println(arrMasyvas);
//        int[] myArray = new int[arrMasyvas];
//        //Taip kaip #2, bet ir dydis ir reikšmės turi būti suvestos vartotojo.
//
//        System.out.println("Įveskite duomenis į masyvą. ( kiekvienas duomuo vis naujoje eilutėje) ");
//        for (int a = 0; a < arrMasyvas; a++) {
//            myArray[a] = Integer.parseInt(s.nextLine());
//
//        }
//        //Suskaičiuokite sumą visų reikšmių įvestų į masyvą (sumo algoritmas).
//        int sum = 0;
//        for( int num : myArray) {
//            sum = sum+num;
//        }
//        System.out.println("Sum of array elements is:"+sum);
//        System.out.println("Masyvas atrodo taip : " + Arrays.toString(myArray));
//        //Suskaičiuokite vidurkį (vidurkio algoritmas).
////        System.out.println("How many numbers you want to enter?");
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
//        /* Declaring array of n elements, the value
//         * of n is provided by the user
//         */
////        double[] arr = new double[n];
////        double total = 0;
//
////        for(int i=0; i<arr.length; i++){
////            System.out.print("Enter Element No."+(i+1)+": ");
////            arr[i] = scanner.nextDouble();
////        }
////        scanner.close();
////        for(int i=0; i<arr.length; i++){
////            total = total + arr[i];
////        }
//
////        double average = total / myArray.length;
////
////        System.out.format("The average is: %.3f", average);
//    }













