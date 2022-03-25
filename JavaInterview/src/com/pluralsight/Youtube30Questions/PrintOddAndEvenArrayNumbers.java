package com.pluralsight.Youtube30Questions;

public class PrintOddAndEvenArrayNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,6,4,7,19};
        String odd="";
        String even="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=arr[i]+",";
            }
            else {
                odd+=arr[i]+",";
            }
        }
        System.out.println("Even numbers: "+even.substring(0,even.length()-1));
        System.out.println("Odd numbers: "+odd.substring(0,odd.length()-1));
    }

}
