package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        /**reverse number with the string*/
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = String.valueOf(num);
        String strReverse="";
        for(int i=str.length()-1;i>=0;i--){
            strReverse+=str.charAt(i)+"";
        }
        int a=Integer.parseInt(strReverse);
        System.out.println(a);
        System.out.println("---------------");
        /**using while to find reverse number*/
        int num2 = scan.nextInt();
        int digit=0;
        int reverse=0;
        while(num2!=0){
           digit=num2%10;
           reverse=reverse*10+digit;
           num2=num2/10;
        }
        System.out.println(reverse);

    }
}
