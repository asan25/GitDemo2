package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num2 = scan.nextInt();
        int count=0;
        while(num2!=0){
            num2=num2/10;
            count++;
        }
        System.out.println(count+" is count of digits");
    }
}
