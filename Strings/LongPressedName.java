package com.manikanta.Strings;

//https://leetcode.com/problems/long-pressed-name/

public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        boolean ans = isLongPressedName(name, typed);
        System.out.println(ans);
    }

    private static boolean isLongPressedName(String name, String typed) {
        int n = name.length(),p = 0;
        for (int i = 0; i < n; i++) {
            if(p < typed.length() && name.charAt(i) == typed.charAt(p)){
                p++;
            }
            else{
                while(p < typed.length() && name.charAt(i) != typed.charAt(p)){
                    if(i != 0 && name.charAt(i-1) != typed.charAt(p)) return false;
                    p++;
                }
                if(p >= typed.length()) return false;
                p++;
            }
        }
        if(p < typed.length()) {
            char ch = name.charAt(n-1);
            while(p < typed.length()){
                if(ch != typed.charAt(p)){
                    return false;
                }
                p++;
            }
        }
        return true;
    }

}
