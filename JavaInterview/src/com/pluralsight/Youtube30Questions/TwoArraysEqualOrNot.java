package com.pluralsight.Youtube30Questions;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {

        int[] arr1={1,2,4,19,5,6,6,4,7};
        int[] arr2={1,2,4,5,6,6,4,7,19};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean status=Arrays.equals(arr1,arr2);
        if(status){
            System.out.println("arr1 is equals to arr2");
        }
        else {
            System.out.println("arr1 is not equals to arr2");
        }



//        if(arr1.length==arr2.length){
//            for(int i=0;i<arr1.length;i++){
//
//            }
//        }
//        else {
//            System.out.println("arr1 is not equal arr2");
//        }
    }
}
