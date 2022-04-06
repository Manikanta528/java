package com.manikanta.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1, 27, 4, 0, 5, 24, 19, 2, 48};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len ; i++){
            //find max element and swap at last
            int last = len - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            //swap last index with maxindex
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i <= end ; i++ ){
            if(arr[max] < arr[i] ){
                max = i;
            }
        }
        return max;
    }
}
