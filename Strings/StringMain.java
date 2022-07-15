package com.manikanta.Strings;

public class StringMain {
    public static void main(String args[]){
        String name = "Manikanta";
//        System.out.println(name);


        //comparsion
        String a = "mani";
        String b = "mani";
        //== checks the ref variables are pointing the same object
        //System.out.println(a==b);

        String name1 = new String("mani");
        String name2 = new String("mani");
        //System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));





    }
}
