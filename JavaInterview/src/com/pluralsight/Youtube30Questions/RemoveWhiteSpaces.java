package com.pluralsight.Youtube30Questions;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "asasan     asdasd  dsdsd  sdsd      asd";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
