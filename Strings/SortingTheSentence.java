package com.manikanta.Strings;

//https://leetcode.com/problems/sorting-the-sentence/

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String res = sortSentence(s);
        System.out.println(res);
    }
    public static String sortSentence(String s) {
        String arr[] = s.split(" ");
        String ans[] = new String[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            int ind = Integer.parseInt(arr[i].substring(arr[i].length()-1));
            ans[ind-1] = arr[i].substring(0,arr[i].length()-1);
        }
        String res = "";
        for (int i = 0; i < ans.length ; i++) {
            if(i != ans.length-1){
                res += ans[i]+" ";
            }else {
                res += ans[i];
            }
        }
        return res;
    }
}
