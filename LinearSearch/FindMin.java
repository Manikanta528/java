package com.manikanta.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 19, -3, 2, -2744, -31, 17};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxnum =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxnum < arr[i]){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }

    static int min(int[] arr) {
        int minnum = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if(minnum > arr[i]){
                 minnum = arr[i];
             }
         }
         return minnum;
    }
}
