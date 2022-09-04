package com.manikanta.oop.cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human mani = new Human(30 , "manikanta");
//        Human random = new Human(mani);

        Human twin = (Human) mani.clone();
        System.out.println(twin.age +" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 101;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(mani.arr));

    }
}
