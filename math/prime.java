package com.manikanta.math;

public class prime {
    public static void main(String[] args) {
        int n = 40;
        for(int i = 2; i < n ; i++){
            System.out.println(i +" "+ isPrime(i));
        }

    }
    static boolean isPrime(int v){
        for (int i = 2; i*i <= v ; i++) {
            if(v%i == 0) return false;
        }
        return true;
    }
}
