package com.pluralsight.Youtube30Questions;

public class ReverseAllWordsInString {
    public static void main(String[] args) {
        String str = "asan ahmadli";
        System.out.println(str);
        System.out.println("--------------");
        String[] reverse=str.split(" ");
        String words="";
        String reverseWord="";
        String str2="";
        for (int i=0;i<reverse.length;i++){
            words=reverse[i];
            reverseWord="";
            for (int k=words.length()-1;k>=0;k--){
                reverseWord+=words.charAt(k)+"";
            }
            str2+=reverseWord+" ";
        }
        System.out.println(str2);

    }
}
