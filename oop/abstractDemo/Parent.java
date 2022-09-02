package com.manikanta.oop.abstractDemo;

public abstract class Parent {

    int age;

    final int VALUE;

    static void hello(){
        System.out.println("hey ");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    public Parent(int age) {
        this.age = age;
        VALUE = 29054234;
    }


    abstract void career();
    abstract void partner();
}
