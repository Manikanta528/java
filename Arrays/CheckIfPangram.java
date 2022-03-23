package com.manikanta.Arrays;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
import java.util.*;

public class CheckIfPangram {
    public static void main (String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        char[] arr = new char[sentence.length()];
//        for(int i = 0; i < sentence.length();i++){
//            arr[i] = sentence.charAt(i);
//        }
//        for(char k : arr){
//            System.out.print(k+" ");
//        }
        boolean res = checkIfPangram(sentence);
        System.out.println(res);
    }
    static boolean checkIfPangram( String sentence){
        boolean ans = false;
        if(sentence.length() >= 26){
            Character[] arr = new Character[sentence.length()];
            //set to eliminate duplicates
            Set<Character> alphabets = new LinkedHashSet<>();
            for(int i = 0; i < sentence.length();i++){
                arr[i] = sentence.charAt(i);

            }
            alphabets.addAll(Arrays.asList(arr));
            if(alphabets.size() == 26){
                ans = true;
            }
        }
        return ans;
    }
}
