package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class FibonaciNumbers {
    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int num3=0;
        for(int i=2;i<15;i++){
            System.out.print(num1+" ");
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }



    }
}
