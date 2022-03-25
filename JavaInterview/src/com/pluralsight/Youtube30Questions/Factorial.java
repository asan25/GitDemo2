package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len=scan.nextInt();
        int factorial=1;
        for(int i=1;i<=len;i++){
            factorial*=i;
        }
        System.out.println("Factorial of the number: "+factorial);
    }
}
