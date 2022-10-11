package com.manikanta.stacksAndQueues.Questions;

//https://leetcode.com/problems/longest-valid-parentheses/submissions/

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "(()";
        System.out.println(minRemoveToMakeValid(s));
    }

    private static int minRemoveToMakeValid(String s) {
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
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) count++;
            else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
