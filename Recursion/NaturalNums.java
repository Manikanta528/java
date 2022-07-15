package com.manikanta.Recursion;

public class NaturalNums {
    public static void main(String[] args) {
        int n = 4;
        print(n);
    }
    static void print( int n ){
        System.out.println(n);
        if(n == 5 ) return;
        print(n+1);
    }
}
