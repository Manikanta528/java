package com.manikanta.Recursion.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 55;
        System.out.println(productOfDigits(n));
    }

    private static int productOfDigits(int n) {
        if(n%10 == n) return n;
        return n%10 * productOfDigits(n/10);
    }
}
