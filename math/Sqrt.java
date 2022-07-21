package com.manikanta.math;

public class Sqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",sqrt(n,p));
    }

    private static double sqrt(int n, int p) {
        int start = 0 , end = n,mid = 0;
        double ans = 0.0;
        while(start <= end){
            mid = start +(end - start)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                end = mid -1;
            }else {
                start = mid +1;
                ans = mid;
            }
        }
        double inc = 0.1;
        for(int i = 0 ; i < p ; i++){
            while(ans*ans <= n){
                ans += inc;
                //System.out.println(ans);
            }
            ans -= inc;
            inc /= 10;
        }
        return ans;
    }
}
