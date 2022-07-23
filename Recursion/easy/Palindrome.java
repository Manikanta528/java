package com.manikanta.Recursion.easy;

public class Palindrome {
    static int sum = 0;
    private static void reverseNum1(int n) {
        if(n == 0) return;
        int rem = n%10;
        sum = sum*10 + rem;
        reverseNum1(n/10);
    }
    static int rev2(int n){
        //sometimes you might need some additional variables in the argument
        // in that case take another helper function
        int  digits = (int)Math.log10(n) +1;
        return helper(n , digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n) return n;
        return (n%10)*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    private static boolean pali(int n) {
        return n == rev2(n);
    }

    public static void main(String[] args) {
        int n = 212;
        System.out.println(pali(n));
        //System.out.println(sum);
    }


}
