package com.manikanta.oop.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three reference vars are pointing to the single obj

        System.out.println(obj1 +" "+ obj2 +" "+ obj3);
    }
}
