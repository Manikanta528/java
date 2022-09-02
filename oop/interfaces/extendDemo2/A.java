package com.manikanta.oop.interfaces.extendDemo2;

public interface A {

    //static interface methods should always have a body
    //Call via the interface name
    static void  greeting(){
        System.out.println("hey i am in static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
