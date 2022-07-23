package com.manikanta.Recursion.easy;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
        doubleRev(n);
    }
    static void onetoN(int n){
       if(n == 0) return;
       onetoN(n-1);
       System.out.println(n);
    }
    static void  doubleRev(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        doubleRev(n-1);
        System.out.print(n+" ");
    }
}
