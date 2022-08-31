package com.manikanta.oop.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "kunal");
        int a = obj.num;

        System.out.println(obj instanceof Object);
    }
}
