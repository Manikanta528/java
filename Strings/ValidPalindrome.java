package com.manikanta.Strings;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder actual = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++ ){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                actual.append(s.charAt(i));
            }
        }
        StringBuilder rev = new StringBuilder();
        for (int i = actual.length()-1 ; i >=0; i--) {
            rev.append(actual.charAt(i));
        }
        if(actual.toString().equals(rev.toString())) return true;
        return false;
    }

}
