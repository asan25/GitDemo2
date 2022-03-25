package com.pluralsight.Youtube30Questions;

public class GetRidOffJunk {
    public static void main(String[] args) {
        String str="aasasasas&^%^&&$&$&^$&^$&^%&%&^%";
        String str1=str.replaceAll(("[^a-zA-Z0-9]"),"");
        System.out.println(str1);
    }
}
