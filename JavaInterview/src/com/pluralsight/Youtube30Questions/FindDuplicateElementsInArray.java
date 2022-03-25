package com.pluralsight.Youtube30Questions;

import java.util.HashSet;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {

        /**using nested loop*/
        int[] arr = {1,2,3,3,9,2,45,32};
        String duplicate="";
        for(int i=0;i<arr.length;i++){

            for(int k=i+1;k<arr.length;k++){
                if(arr[i]==arr[k]){
                  duplicate=arr[i]+"";
                    System.out.println(duplicate);
                }
            }

        }

        /**using hashset to find double elements*/
        System.out.println("----------------------------------------------------------------");
        int[] arr1 = {1, 2, 3, 9, 45, 32};
        boolean flag = false;
        HashSet<Integer> set = new HashSet();
        for (Integer num : arr1) {
            if (set.add(num) == false) {
                System.out.println(num);
                flag = true;
            }

        }
        if (flag == false) {
            System.out.println("Not found duplicate");
        }
    }
}
