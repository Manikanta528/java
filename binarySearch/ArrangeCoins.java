package com.manikanta.binarySearch;

//https://leetcode.com/problems/arranging-coins/

import java.util.*;

public class ArrangeCoins {
    public static void main (String[] args){
        int n = 1804289383;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n){
        //time execution error
//        List<Integer> arr = new ArrayList<>();
//        int temp = 1;
//        do{
//            int value = 0;
//            value = temp*(temp+1)/2;
//            arr.add(temp-1,value);
//            //System.out.print(arr.get(temp-1)+ " ");
//            temp++;
//        }while(arr.get(temp-2) < n);
//        if(arr.get(arr.size()-1) == n){
//            return arr.size();
//        }
//        else{
//            return arr.size()-1;
//        }
        int start = 1 ,end = n,res=0;
        while(start <= end ){
            long mid = start + (end - start)/2;
            if(mid*(mid+1)/2 <= n){
                res = (int)mid;
                start = (int)mid + 1;
            }
            else{
                end = (int)mid - 1;
            }
        }
        return res;
    }
}
