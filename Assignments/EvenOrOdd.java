package com.manikanta.Assignments;
import java.util.*;

// Write a program to print whether a number is even or odd, also take input from the user.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class EvenOrOdd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num =sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+"is even number");
        }
        else{
            System.out.println(num+" is odd number");
        }

    }
}
