package com.manikanta.Strings;

//https://leetcode.com/problems/reverse-prefix-of-word/

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word ="abcdefd";
        char ch = 'd';
        String ans = reversePrefix(word,ch);
        System.out.println(ans);
    }

    private static String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        if(ind > -1){
            String temp = "";
            for (int i = ind ; i >= 0 ; i--){
                temp += word.charAt(i);
            }
            word = temp + word.substring(ind+1,word.length());
        }
        return word;
    }

}
