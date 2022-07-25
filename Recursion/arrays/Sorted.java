package com.manikanta.Recursion.arrays;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = {383,3,53,4};
        boolean ans = sortedOrNot(arr, 0);
        System.out.println(ans);
    }
    static boolean sortedOrNot(int[] arr, int index){
        // base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index +1 ] && sortedOrNot(arr,index+1);
    }
}
