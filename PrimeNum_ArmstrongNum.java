package com.manikanta;

import java.util.Scanner;

public class PrimeNum_ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        //System.out.println(isPrime(num));
        //System.out.println(isArmstrongNum(num));
        for(int i= 100; i < 1000 ;i++){
            if(isArmstrongNum(i)){
                System.out.println(i+ " ");
            }
        }
    }
    static boolean isArmstrongNum(int n){
        int r,sum = 0;
        int temp =n;
        while(n > 0){
            r = n%10;
            sum = sum + (r*r*r);
            n =n/10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }

    static boolean isPrime(int n){
        int count =0;
        for(int i=2; i<=n/2 ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
