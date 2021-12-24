package com.manikanta.functions;

public class MethodOverLoading {
    public static void main(String[] args) {
        fun(27);
        fun("Iron Man");

    }
    static void fun (int a){
        System.out.println("1st function\n"+a);
    }
    static void fun (String name){
        System.out.println("2nd function\n"+name);

    }
}
