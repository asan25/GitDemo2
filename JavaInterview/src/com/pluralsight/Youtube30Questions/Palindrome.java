package com.pluralsight.Youtube30Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i)+"";
        }
        System.out.println("----------");
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(str+" is Palindrome");
        }
        else {
            System.out.println(str+" is not Palindrome");
        }

    }

}
