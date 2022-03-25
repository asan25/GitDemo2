package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int count = 0;
        String prime = "";
        String notPrime = "";
        for (int i = 1; i < len; i++) {
            count = 0;
            for (int k = 1; k < len; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count > 2) {
                notPrime = notPrime + i + ",";

            } else {
                prime = prime + i + ",";
            }
        }
        System.out.print("Not Prime numbers: ");
        System.out.print(notPrime.substring(0, notPrime.length() - 1));
        System.out.println();
        System.out.print("Prime number: ");
        System.out.print(prime.substring(0, prime.length() - 1));
    }
}
