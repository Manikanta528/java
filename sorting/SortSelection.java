package com.manikanta.sorting;

import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int arr[] = {6,4,5,2,3,0,1};
        sortSelectionRec(arr,0,arr.length-1,arr[0],0);
        System.out.println(Arrays.toString(arr));
    }
    //recursion selection sort array -> arr ,start -> s,end-> e,max ele ->max , maxIndex -> ind;
    private static void sortSelectionRec(int[] arr, int s,int e,int max , int ind) {
        if(e == 0) return;
        if(s < e) {
            if(max < arr[s]){
                max = arr[s];
                ind = s;
            }
            sortSelectionRec(arr,s+1,e,max,ind);
        }else{
            int temp = arr[e];
            arr[e] = max;
            arr[ind]= temp;
            sortSelectionRec(arr,0,e-1,arr[0],0);
        }
    }

    private static void sortSelection(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            int max = arr[0];
            int ind = 0;
            for (int j = 0; j < len-i; j++) {
                if(max < arr[j]){
                    max = arr[j];
                    ind = j;
                }
            }
            int temp = arr[ind];
            arr[ind] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }

}
