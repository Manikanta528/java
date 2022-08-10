package com.manikanta.Strings;

//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1100";
        boolean ans = checkOneSegment(s);
        System.out.println(ans);
    }

    private static boolean checkOneSegment(String s) {
        int n = s.length();
        int countrec = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') count++;
        }
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') countrec++;
            else break;
        }
        if(countrec == count ) return true;
        return false;
    }

}
