package com.manikanta.Assignments;
import java.util.*;

//To find out whether the given String is Palindrome or not.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s1 = sc.next();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();

        if (s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
