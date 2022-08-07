package com.manikanta.Strings;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);
    }
    public  static  boolean halvesAreAlike(String s){
        int mid = s.length()/2,cv1 = 0,cv2 = 0;
        String first = s.substring(0,mid).toUpperCase();
        String second = s.substring(mid,s.length()).toUpperCase();
        for(int i = 0 ; i < mid ; i++){
            char ch1 = first.charAt(i);
            char ch2 = second.charAt(i);
            if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'){
                cv1++;
            }
            if(ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U'){
                cv2++;
            }
        }
        if(cv1 == cv2) return true;
        return false;

    }
}
