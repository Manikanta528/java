package com.manikanta.binarySearch;

import java.util.Arrays;

public class ValidPerfectSquare {
    public static void main(String[] args){
        int num = 1;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num){
        if(num == 1) return true;

        long start = 2, end = num;

        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid < num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            //mid = start + (end - start)/2;
        }
        return false;
    }
}
