package com.manikanta.Recursion.strings;

import java.util.ArrayList;

public class Premutations {
    public static void main(String[] args) {
//        premutations("","abc");

//        ArrayList<String> list = premutationsList("","abcd");
//        System.out.println(list);
        System.out.println(premutationsCount("","abcde"));
    }
    public static  void premutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            premutations(f + ch + s, up.substring(1));
        }
    }
    public static ArrayList<String> premutationsList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ArrayList<String> temp = premutationsList(f + ch + s, up.substring(1));
            ans.addAll(temp);
        }
        return ans;
    }

    public static int premutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + premutationsCount(f + ch + s , up.substring(1));
        }
        return count;
    }
}
