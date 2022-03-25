package com.pluralsight.Youtube30Questions;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,6,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the array elements: "+sum);
    }
}
