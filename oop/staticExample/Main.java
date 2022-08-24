package com.manikanta.oop.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human mani = new Human(20,"mani kanta", 50000,false);
//        Human jim = new Human(23,"jim", 500000,true);
//
//        System.out.println(mani.population);
//        System.out.println(jim.population);

    }
    // this is not dependent on objects
    static void fun(){
//        greeting();// you can not use it because it requires object

        // we cannot access non static stuff without referencing their instances in a static context

        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is non-static , belongs to an object
    void greeting (){
        System.out.println("hello world!");
    }
}
