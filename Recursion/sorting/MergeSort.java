package com.manikanta.Recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int s, int e) {
        if(e - s == 1){
            return;
        }
        int m = (s+e)/2;
        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m,e);

        mergeInPlace(arr,s,m,e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int mix[] = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            }else{
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }

    private static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int mix[] = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
                k++;
            }else {
                mix[k] = right[j];
                j++;
                k++;
            }
        }
        //if certain pointer of arrays gets out of add remaining all elements to merge array

        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

}
