package com.manikanta;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(28);
//        list.add(128);
//        list.add(228);
//        list.add(328);
//        list.add(428);
//
//        System.out.println(list.contains(27));
//        System.out.println(list);
//        list.set(0, 27);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);

    }
}
