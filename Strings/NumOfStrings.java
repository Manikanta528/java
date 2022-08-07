package com.manikanta.Strings;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/submissions/

public class NumOfStrings {
    public static void main(String[] args) {
        String patterns[] = {"a","abc","bc","d"};
        String word = "abc";
        int ans = numOfStrings(patterns,word);
        System.out.println(ans);
    }
    public static int numOfStrings(String[] patterns, String word){
        int ans = 0,n = patterns.length;
        for (int i = 0; i < n ; i++) {
            if(word.contains(patterns[i])){
                ans++;
            }
        }
        return ans;
    }
}
