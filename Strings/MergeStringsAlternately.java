package com.manikanta.Strings;

//https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        String ans = mergeAlternatively(word1,word2);
        System.out.println(ans);
    }

    private static String mergeAlternatively(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int n = word1.length(),m = word2.length();
        int minLen = n < m ? n : m;
        for (int i = 0; i < minLen; i++) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        ans.append(word1.substring(minLen,n));
        ans.append(word2.substring(minLen,m));
        return ans.toString();
    }

}
