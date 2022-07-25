package com.manikanta.Recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,4,4,18,9};
        int target = 4;
        ArrayList<Integer>  ans = new ArrayList<>();
        System.out.println(findIndex2(arr, target, 0));

        System.out.println(linearSearch(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexBack(arr, target, 7));
        System.out.println(findAllIndex(arr,target, 0,ans));

    }
    // linear search from 0 to n return list of target index's
    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> ans) {
        if(index == arr.length){
            return ans;
        }
        if(arr[index] == target){
            ans.add(index);
        }
        return  findAllIndex(arr,target,index+1,ans);
    }
    // linear search from 0 to n return true or false
    static boolean linearSearch(int arr[], int target,int index){
        if(index == arr.length ){
            return false;
        }
        return arr[index] == target || linearSearch(arr,target,index+1);
    }
    // linear search from n to 0 return index or -1
    static int findIndexBack(int arr[], int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return  findIndexBack(arr,target,index-1);
    }
    // linear search from 0 to n return index or -1
    static int findIndex(int arr[], int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return  findIndex(arr,target,index+1);
    }
    //recursion with no arg list
    static ArrayList<Integer> findIndex2(int arr[], int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
