package com.manikanta.Assignments;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }

    private static String addBinary(String a, String b) {
        String ans = "";
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        int al = arr.length,bl = brr.length;
        int p = 0;

        int carry = 0;
        while(p < al || p < bl){
            int add = 0;
            int c1 = 0,c2 = 0;
            if(p < al){
                c1 = (int)(arr[al-1-p]-'0');
            }
            if(p < bl){
                c2 = (int)(brr[bl-1-p]-'0');
            }
            add = carry+c1+c2;
            if(add == 2){
                carry = 1;
                ans = "0"+ans;
            }
            else if(add == 3){
                carry = 1;
                ans = "1"+ans;
            }
            else if(add == 1){
                carry = 0;
                ans = "1"+ans;
            }else{
                carry = 0;
                ans = "0"+ans;
            }
            p++;
        }
        if(carry == 1) ans = "1"+ans;
        return ans;
    }
}
