package com.manikanta.oop.intro;

public class Main {
    public static void main(String[] args) {
        // Store 5 roll nos
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student mani = new Student(528,"manikanta",7.56f);
        Student kunal = new Student(13,"kunal",9.56f);
        mani.greeting();

//        mani.rno = 528;
//        mani.name = "Manikanta Cheepurupalli";
//        mani.marks = 6.56f;

        System.out.println(mani.rno);
        System.out.println(mani.name);
        System.out.println(mani.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "some thing some thing";

        System.out.println(two.name);


    }

    //create a class
    static class Student{
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("hello! my name is "+ this.name);
        }
        void changeName(String name){
            this.name = name;
        }

        Student(Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        Student () {
            // this is how we call a constructor from another constructor
            this (13, "default person", 100.0f);
        }

        Student (int rno, String name , float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }


    }
}
