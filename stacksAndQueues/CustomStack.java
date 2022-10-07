package com.manikanta.stacksAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an Empty Stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an Empty Stack");
        }
        return data[ptr];
    }

    private boolean isFull() {
        if(ptr+1 ==  data.length) return true;
        return false;
    }
    private boolean isEmpty() {
        if(ptr ==  -1) return true;
        return false;
    }
}
