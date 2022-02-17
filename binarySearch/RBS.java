package com.manikanta.binarySearch;

import java.sql.SQLOutput;

public class RBS {
    public static void main (String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        int target = 0;
        //System.out.println(arr[pivot]+" "+pivot);
        int result = Search(arr, target);
        System.out.println(arr[result]+" "+result);
    }
    static int Search(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(pivot == target){
            return pivot;
        }
        if(target < arr[start]){
            start = pivot +1;
            return binarySearch(arr, target, start, end);
        }
        else{
            end = pivot;
            return binarySearch(arr, target, start, end);
        }
    }

    static int binarySearch(int[] arr, int target, int start ,int end){
        while(start <= end){
            int mid = start + (end - start )/2;

            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while( start <= end ){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if ( mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

        }
        return -1;
    }
}
