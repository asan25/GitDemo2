package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        /**using loop and charAt methods*/
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i)+"";
        }
        System.out.println("----------");
        System.out.println(reverse);

        /**using string buffer*/
        StringBuffer sb = new StringBuffer(str);
         System.out.println(sb.reverse());

        /**using char array and .toCharArray method*/
         char[] ch = str.toCharArray();
         String chReverse="";
         for(int i=ch.length-1;i>=0;i--){
             chReverse+=ch[i];
         }
        System.out.println(chReverse);
    }
}
