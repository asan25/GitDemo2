package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num2 = scan.nextInt();
        int digit=0;
        int reverse=0;
        while(num2!=0){
            digit=num2%10;
            reverse=reverse+digit;
            num2=num2/10;
        }
        System.out.println("Sum of the digits = "+reverse);
    }
}
