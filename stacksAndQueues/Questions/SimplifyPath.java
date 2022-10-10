package com.manikanta.stacksAndQueues.Questions;

//https://leetcode.com/problems/simplify-path/

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home/";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String arr[] = path.split("/");

        for(String dir : arr){
            if(dir.equals("")){
                continue;
            }
            else if(dir.equals(".")){
                continue;
            }
            else if(dir.equals("..")){
                if(stack.isEmpty()){
                    continue;
                }
                stack.pop();
            }
            else {
                stack.push(dir);
            }
        }
        if(stack.isEmpty()) return "/";
        return "/"+stack.toString().replace(",","/").replace(" ","").replace("[","").replace("]","");
    }
}
