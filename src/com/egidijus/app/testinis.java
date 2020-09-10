package com.egidijus.app;

import javax.swing.JOptionPane;

class Average {

    public static void main (String [] args){

        String test1, test2, test3;

        test1= JOptionPane.showInputDialog("Please input mark for test 1: ");

        test2= JOptionPane.showInputDialog("Please input mark for test 2: ");

        test3= JOptionPane.showInputDialog("Please input mark for test 3: ");

       int avg = Integer.parseInt((test1 + test2 + test3));

        System.out.println(avg);

    }

}