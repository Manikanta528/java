package com.manikanta.oop.intro;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;


        Integer a = 45;
        Integer b = 55;

        swap(a, b);
        System.out.println(a+" "+ b);

//        final int bonus = 10;
//        bonus = 30;

        final A kunal = new A("kunal");
        kunal.name = "other name";

        // when a non primitive is final , you cannot reassign
//        kunal = new A("harry");

        A obj = new A("jim");
        System.out.println(obj);

//        for (int i = 0; i < 10000000; i++) {
//            obj = new A("random name");
//        }


    }
    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    static class A{
        final  int num = 10;
        String name ;

        A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}
