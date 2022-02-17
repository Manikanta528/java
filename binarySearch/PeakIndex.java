//Peak Index of the Mountain array
package com.manikanta.binarySearch;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,10,9,7,5,2,1,0};
        int ans = peak(arr);
        System.out.println(ans);
    }
    static int peak (int[] arr){
        int start = 0;
        int end = arr.length-1 ;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                //it is in the asc part of the array
                start = mid +1;
            }
            else if (arr[mid] > arr[mid+1]){
                // it is in the dec part of the array
                end = mid ;
            }
        }
        return start;
    }
}
