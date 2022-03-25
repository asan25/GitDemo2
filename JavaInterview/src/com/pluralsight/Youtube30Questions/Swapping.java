package com.pluralsight.Youtube30Questions;

public class Swapping {
    public static void main(String[] args) {

        /**swapping two numbers*/
        int a=10;
        int b=20;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("------");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
