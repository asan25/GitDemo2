package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class EvenOrOddDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num2 = scan.nextInt();
        int digit=0;
        int odd=0;
        int eve=0;
        while(num2!=0){
            digit=num2%10;
            num2=num2/10;
            if(digit%2==0&&digit!=1){
                eve++;
            }
            else {
                odd++;
            }
        }
        System.out.println(odd+" is count of odd digits");
        System.out.println(eve+" is count of even digits");
    }
}
