package com.manikanta.Recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {0,5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low , int hi){
        //base condition
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        //taking mid element as pivot
        int pivot = arr[m];

        while(s <= e){
            //to check if there is a violation
            while (arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            //if both left and right has violation then swap
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            // after swap we get pivot element is at correct position
        }
        // via recursion sort the left part (from low to e) and right part (from s to hi) of the pivot element
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}
