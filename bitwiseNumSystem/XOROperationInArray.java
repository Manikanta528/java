package com.manikanta.bitwiseNumSystem;

//https://leetcode.com/problems/xor-operation-in-an-array/

public class XOROperationInArray {
    public static void main(String[] args) {
        int n = 5 , start = 0;
        System.out.println(xorOperationInArray(n,start));
    }

    private static int xorOperationInArray(int n, int start) {
        int arr[] = new int[n];
        int p = 0;
        for(int i = start ; i < n*2+start; i+=2){
            arr[p++] = i;
        }
        int ans= arr[0];
        for(int j = 1 ; j < n ; j++){
            ans ^=arr[j];

        }
        return ans;
    }
}
