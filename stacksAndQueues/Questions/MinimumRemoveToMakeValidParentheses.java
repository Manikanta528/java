package com.manikanta.stacksAndQueues.Questions;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }

    private static String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[s.length()];
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else if( c == ')'){
                if(!stack.isEmpty()){
                    arr[i]++;
                    arr[stack.pop()]++;
                }
            }
        }
        for (int i = s.length()-1; i > -1; i--) {
            char c = s.charAt(i);
            if((c == '(' || c == ')') && arr[i] == 0){
                str = new StringBuilder(s.substring(0, i) + s.substring(i+1, s.length()));
                s = str.toString();
            }
        }
        return str.toString();
    }
}
