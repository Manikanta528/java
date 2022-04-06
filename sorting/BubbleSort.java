package com.manikanta.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {-1, -27, -4, 0, -5, 24, 19, 2, 48};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        //n-1 passes
        boolean swaped ;
        for (int i = 0; i < arr.length; i++) {
            swaped = false;
            //for checking adjacent  values to swap
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
