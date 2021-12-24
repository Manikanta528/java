package com.manikanta.LinearSearch;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 20, 49, 572, 4, 48, 98, 12 ,27, 54, 28, 29};
        int target = 122;
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
       return -1;
    }
}
