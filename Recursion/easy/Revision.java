package com.manikanta.Recursion.easy;

import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
//        int arr[] = new int[]{1,2,3,4,5,6};
//        System.out.println(Arrays.toString(arr));
//        reverseArray(0,arr.length-1,arr);
//        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int l, int r, int[] arr) {
        if(l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(l+1, r-1, arr);
    }

    static  int fact(int n ){
        if(n <= 1) return 1;
        return n * fact(n-1);
    }
    static int sum(int n ){
        if(n == 0) return 0;
        return n + sum(n-1);
    }

}
