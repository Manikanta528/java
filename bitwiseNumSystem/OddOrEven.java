package com.manikanta.bitwiseNumSystem;

public class OddOrEven {
    public static void main(String[] args) {
        int a = 62;
        System.out.println(isOdd(a));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
