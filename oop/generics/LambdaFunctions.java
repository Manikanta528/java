package com.manikanta.oop.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
//        list.forEach((item) -> System.out.println(item *2));
        Consumer<Integer> fun = (item) -> System.out.println(item *2);
        list.forEach(fun);

        Operation sum  = (a, b) -> a+b;
        Operation prod  = (a, b) -> a*b;
        Operation sub  = (a, b) -> a-b;

        LambdaFunctions myCal = new LambdaFunctions();
        System.out.println(myCal.operate(5,6,sum));
        System.out.println(myCal.operate(5,6,prod));
        System.out.println(myCal.operate(5,6,sub));
    }
    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a , int b);
}
