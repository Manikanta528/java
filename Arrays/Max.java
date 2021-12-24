package com.manikanta.Arrays;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {222 ,28 , 27, 16, 31 ,32};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
    }
    static void reverseArr(int[] arr){
        int[] temparr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temparr[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(temparr));
    }
    static int max(int[] arr){
        int maxitem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxitem < arr[i]){
              maxitem = arr[i];
            }
        }
        return maxitem;
    }
}
