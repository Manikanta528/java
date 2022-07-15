package com.manikanta.Recursion;

public class BinarySearchRe {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,15,17,19,21,23,25};
        int ans = bsr(arr,16,0,12);
        System.out.println(ans);
    }
    static int bsr(int arr[],int target, int start, int end){
        int mid = start + (end-start)/2;
        if(start > end) return -1;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) end = mid-1;
        else start = mid+1;
        return bsr( arr, target,start , end);
    }
}
