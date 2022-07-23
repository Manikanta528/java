package com.manikanta.Recursion.easy;

public class Nto1 {
    public static void main(String[] args) {
        int n = 6;
        nto1(n);
    }
    static void nto1(int n){
        if(n == 0) return;

        System.out.println(n);
        nto1(n-1);
    }
}
