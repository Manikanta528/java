package com.manikanta.binarySearch;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {-18, -11, -9, -2,-1, 0 , 4, 12, 22, 44, 83,100};
        int target = 10;
        int ans = Ceiling(arr , target);
        System.out.println(ans);
    }
    //return the index of target or greater target else return -1 if don't exist
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end ){
            if( target == arr[arr.length-1]){
                return -1;
            }
            int mid = start + (end - start )/2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
