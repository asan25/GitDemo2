package com.pluralsight.Youtube30Questions;

public class FindMaxMinElementsInArray {
    public static void main(String[] args) {
        int[] a ={1,2,4,5,19,6};
        int max=a[0]; //1
        for(int i=0;i<a.length;i++){
          if(a[i]>max) {
            max=a[i];
          }

        }
        System.out.println(max);
    }





}
