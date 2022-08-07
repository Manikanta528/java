package com.manikanta.Strings;

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/

public class FreqAlphabets {
    public static void main(String[] args) {
        String s = "1326#";
        String ans = freqAlphabets(s);
        System.out.println(ans);
    }
    public static String freqAlphabets(String s){
        String ans = "";
        while(s.length() > 0){
            if(s.length() > 2){
                char ch = s.charAt(2);
                //System.out.println("*"+ch);
                if(ch == '#'){
                    Integer num1 = Integer.parseInt(s.substring(0,2));
                    ans += (char)('a'+num1.intValue()-1);
                    //System.out.println(s.substring(0,3));
                    s = s.substring(3,s.length());
                }else{
                    Integer num2 = Integer.parseInt(s.substring(0,1));
                    ans += (char)('a'+num2.intValue()-1);
                    //System.out.println(s.substring(0,1));
                    s = s.substring(1,s.length());
                }
            }else{
                Integer num3 = Integer.parseInt(s.substring(0,1));
                ans += (char)('a'+num3.intValue()-1);
                //System.out.println(s.substring(0,1));
                s = s.substring(1,s.length());
            }
        }
        return ans;
    }
}
