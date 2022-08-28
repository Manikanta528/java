package com.manikanta.oop.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6,7.9,9.3);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l +" "+ box1.h +" " + box1.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h+" " +box3.weight);

        Box box5 = new BoxWeight(2,3 ,4,8);
        System.out.println(box5.w);

        //when an obj itself is a parent class, then how will you call the constructor of child class
        // hence this a error

//        BoxWeight box6 = new Box();
//        System.out.println(box6);
    }
}
