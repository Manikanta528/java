package com.manikanta.Arrays;

import java.util.*;

//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String args[]){
        int accounts[][] = {{1,5},{7,3},{21,4}};
        System.out.println(accounts.length);
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
    static int maximumWealth(int[][] accounts){
        int ans;
        int arr[] = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        ans = arr[arr.length-1];
        return ans;
    }
}
