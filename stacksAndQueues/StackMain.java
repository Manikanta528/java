package com.manikanta.stacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(11);
        stack.push(6);
        stack.push(22);
        stack.push(27);
        stack.push(29);
        stack.push(19);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
