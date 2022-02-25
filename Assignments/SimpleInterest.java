package com.manikanta.Assignments;
import java.util.*;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class SimpleInterest {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount :");
        int principal = sc.nextInt();
        System.out.print("Enter time ( in years ):");
        int time = sc.nextInt();
        System.out.print("Enter annual interest rate :");
        int rate = sc.nextInt();
        int si = (principal * rate * time)/100;
        System.out.println("Simple Interest : "+ si);
    }
}
