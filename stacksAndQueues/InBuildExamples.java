package com.manikanta.stacksAndQueues;

import java.util.*;

public class InBuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(11);
        stack.push(6);
        stack.push(22);
        stack.push(27);
        //System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(51);
        queue.add(7);
        queue.add(24);
        queue.add(8);
        queue.add(29);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
    }
}
