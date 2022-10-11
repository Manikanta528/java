package com.manikanta.stacksAndQueues.Questions;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    private static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        return stack.size() + count;
    }
}
