package com.manikanta.math;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 1111111;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }

    private static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int rem,sqrSum = 0;

        boolean op = false ;
        while(true){
            rem = n % 10;
            sqrSum += rem*rem;
            n/=10;
            if(n == 0){
                if(sqrSum == 1){
                    op = true;
                    break;
                }
                else{
                    if(set.contains(sqrSum)){
                        break;
                    }
                    set.add(sqrSum);
                    n = sqrSum;
                    sqrSum = 0;
                }
            }

        }
        return op;

        /*
        // my brute force
        int rem;
        int ans = 0;
        boolean op  = false;
        while(true){
            rem = n % 10;
            ans += (int)Math.pow(rem,2);
            n/=10;
            if(n == 0 ){
                System.out.println(ans);
                if(ans == 1){
                    op = true;
                    break;
                }
                if(ans < 7 ) {
                    op = false;
                    break;
                }
                n = ans;
                ans = 0;
            }
        }
        return op;*/
    }
}
