package com.pluralsight;

import java.util.Scanner;

public class Phone_number_026 {
    public static void main(String[] args) {
        /**Instructions from your teacher:
         Write a program that asks user to input int values: areaCode and localNumber.
         -Using concatenation put together in this format and assign to String phoneNumber variable:
         -(222)-3334444
         -Write a print statement that displays (use phoneNumber variable ):
         Calling number (222)-3334444*/


        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Please enter the number");
        int size = 0;
        int number = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if ((a[i] == number)) {
                System.out.println("correct number " + number);
            } else {
                size++;
                if (size == a.length) {
                    System.out.println("not found");
                }

            }

        }




        }//main

}

