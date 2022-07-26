package com.manikanta.Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,6};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr,int s, int e) {
        if(e == 0){
            return;
        }
        if(s<e){
            if(arr[s] > arr[s+1]){
                //swap
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            bubbleSort(arr,s+1,e);
        }
        else{
            bubbleSort(arr,0,e-1);
        }
    }

}
