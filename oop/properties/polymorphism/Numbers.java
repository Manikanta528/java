package com.manikanta.oop.properties.polymorphism;

public class Numbers {
    double sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(2,3,4);
    //    obj.sum(2,3,4,5);
    }
}
