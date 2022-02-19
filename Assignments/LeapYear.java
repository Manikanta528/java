package com.manikanta.Assignments;
import java.util.*;
public class LeapYear {
    public static void main (String args[]){
        System.out.println("Enter year to check leapYear :");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0  && (year % 400 == 0 || year % 100 !=0) ){
            System.out.println("LeapYear");
        }
        else {
            System.out.println("Not LeapYear");
        }
    }
}
