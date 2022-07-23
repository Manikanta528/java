package com.manikanta.Recursion.easy;

public class CountZeros {
    public static void main(String[] args) {
        int n = 30204;
        int ans = countZeros(n);
        System.out.println(ans);
    }

    private static int countZeros(int n) {
        int count = 0 ;
        return hepler(n,count);
    }

    private static int hepler(int n, int count) {
        if(n == 0) return count;
        int rem = n%10;
        if(rem == 0) return hepler(n/10,count+1);
        return hepler(n/10,count);
    }

}
