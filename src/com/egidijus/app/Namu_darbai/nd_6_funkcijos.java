package com.egidijus.app.Namu_darbai;

import java.util.Arrays;
import java.util.Scanner;

public class nd_6_funkcijos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //allow user  input;
        System.out.println("Įveskite iš kiek narių bus masyvas?");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Įveskite " + num + " masyvo elementus.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = input.nextInt();
        }

        //you notice that now the elements have been stored in the array .. array[]

        System.out.println("Įvestas masyvas.");
        printArray(array);

        System.out.println("");

        input.close();
        int max = getMax(array);
        System.out.println("Maksimali reikšmė: "+max);

        // Calling getMin() method for getting min value
        int min = getMin(array);
        System.out.println("Minimali reikšmė: "+min);

        // Calling getSum() method for getting sum value
        int sum = getSum(array);
        System.out.println("Viso masyvo suma: "+sum);

        int[] arr2 = array;
        System.out.println("Prieš rikiavimą: " + Arrays.toString(array));
        int iterationCounter = 0, swapCounter = 0;

        for (int k = 0; k < arr2.length - 1; k++) {
            for(int kidx = 0; kidx < arr2.length - 1 - k; kidx++) {
                iterationCounter++;
                if(arr2[kidx] > arr2[kidx + 1]){
                    swapCounter++;
                    int temporary = arr2[kidx + 1];
                    arr2[kidx + 1] = arr2[kidx];
                    arr2[kidx] = temporary;
                }
            }
        }

        System.out.println("Iteracijų : " + iterationCounter);
        System.out.println("Apkeitimų vietomis : " + swapCounter);
        System.out.println("Po rikiavimo: " + Arrays.toString(array));


    }

    //this method prints the elements in an array......
    //if this case is true, then that's enough to prove to you that the user input has  //been stored in an array!!!!!!!
    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    // Method for getting array sum
    public static int getSum(int[] inputArray){
        int SumValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){

            SumValue = SumValue + inputArray[i];


        }
        return SumValue;
    }


}


