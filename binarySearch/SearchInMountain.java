package com.manikanta.binarySearch;

public class SearchInMountain {
    public static void main (String args[]){
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;   
        int result = Search(arr, target);
        System.out.println(result);
    }
    static int Search(int[] arr , int target ){
        int maxIndex = peak(arr);
        int ans = binarySearch(arr, maxIndex, target);
        return ans;
    }
    static int peak(int[] arr){
        // to find peak element
        int start =0;
        int end= arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if( arr[mid] > arr[mid+1] ){
                // if
                end =mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    static int binarySearch( int[] arr, int maxIndex, int target){
        int start = 0;
        int end = maxIndex;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end= mid -1;
            }
        }
        return -1;
    }
}
