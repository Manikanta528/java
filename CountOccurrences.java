package com.manikanta;

import java.util.Scanner;
import java.lang.*;

public class CountOccurrences {
    public static void main(String[] args) {
  //      Scanner in = new Scanner(System.in);
//        String s1 = in.next();
//        String n = in.next();
//        char a = n.charAt(0);
//        int count = 0;
//
//        for(int i =1 ; i < s1.length() ; i++ ){
//            char b =s1.charAt(i);
//            if (a == b) {
//                count++;
//            }
//        int num = in.nextInt();
//        int n = in.nextInt();
//
//
//        while(num>0 ){
//            int r = 0;
//            r = num % 10;
//            num = num / 10;
//            if (n == r) {
//                count++;
//            }
//        }
        //reverse of number
//        int num =45678;
//        String s1 = Integer.toString(num);
//        int len = s1.length()-1;
//        double temp = 0;
//        while(num > 0 ) {
//            int r = num % 10;
//            temp = temp + r * (Math.pow(10, len));
//            num = num / 10;
//            len--;
//        }
//        System.out.println(temp);
        int num =54321;
        int temp = 0;
        while(num > 0 ) {
            int r = num % 10;
            temp = temp *10 +r;
            num = num / 10;
        }
        System.out.println(temp);
    }
}
