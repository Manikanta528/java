package com.manikanta.bitwiseNumSystem;

public class PowOf2 {
    public static void main(String[] args) {
        int n = 16;
        // note fix for n == 0
        if((n&n-1) == 0) System.out.println(true);
        else System.out.println(false);
    }
}
