package com.manikanta;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Mani Kanta";
        char target = 'z';
        System.out.println(search(name, target));
    }
    static boolean search(String s1, char key){
        if(s1.length() == 0){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(key == s1.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
