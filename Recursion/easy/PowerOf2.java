package com.manikanta.Recursion.easy;

public class PowerOf2 {
    public static void main(String[] args) {
        int n =16;
        System.out.println(isPowerOfTwo2(n));
    }
    //recursion
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if(n%2 != 0) return false;

        return isPowerOfTwo(n/2);
    }
    //iterative
    public static boolean isPowerOfTwo2(int n){
        if(n == 1) return true;
        if(n == 0) return false;
        while(n > 0){
            if(n == 1) return true;
            if( n%2 != 0) return false;
            n/=2;
        }
        return true;
    }

}
