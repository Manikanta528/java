package com.manikanta.bitwiseNumSystem;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int ans = 0,p=1;
        while(n > 0){
            if((n&1) == 1){
                ans+=(int)Math.pow(5,p);
            }
            p++;
            n= n>>1;
        }
        return ans;
    }
}
