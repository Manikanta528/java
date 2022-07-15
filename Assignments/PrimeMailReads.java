package com.manikanta.Assignments;

import java.util.*;

public class PrimeMailReads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = numOfPrimes(n);

//        for(int k : arr){
//            System.out.print(k + " ");
//        }
        int count1 = 0;
        while(n > 1){
            count1++;
            n = n-arr[n-1];
            //System.out.println(arr[n-1]);
        }
        System.out.println(count1+1);
    }
    static int[] numOfPrimes(int n){
        int count = 0;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            if( prime(i) ) count++;
            arr[i-1] = count;
        }
        return arr;
    }
    static boolean prime(int i){
        if(i <= 1) return false;
        int half = i/2;
        for (int j = 2; j <= half; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }
}
