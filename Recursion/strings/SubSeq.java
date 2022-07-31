package com.manikanta.Recursion.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        //subseq("",str);
        ArrayList<String> ans = subseq1Ret("",str);;

        System.out.println(ans);
    }

    private static void subseq(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    private static void subseq(String p, String up, ArrayList<String> ans) {
        if(up.isEmpty()){
            if(p != "")
                ans.add(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1),ans);
        subseq(p, up.substring(1),ans);
    }
    private static ArrayList<String> subseq1Ret(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            if(p != "")
                list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1Ret(p + ch, up.substring(1));
        ArrayList<String> right = subseq1Ret(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
