package com.manikanta;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Multiline
        comments
        */
        int sal = 55450;
//        if(sal > 25000){
//            sal = sal + 5000;
//        }else {
//            sal = sal + 2500;
//        }

        // multiple if-else

        if( sal > 60000){
            sal += 6000;
        }else if ( sal > 50000){
            sal += 5000;
        }else{
            sal += 2500;
        }
        System.out.println(sal);
    }
}
