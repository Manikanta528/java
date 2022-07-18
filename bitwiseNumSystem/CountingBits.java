package com.manikanta.bitwiseNumSystem;

class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = countBits(n);
        for(int v: arr){
            System.out.print(v+" ");
        }
    }
    public static int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            int t = i;
            int count = 0;
            while(t > 0){
                if((t&1) == 1) count++;
                t>>=1;
            }
            ans[i] = count;
        }
        return ans;
    }
}