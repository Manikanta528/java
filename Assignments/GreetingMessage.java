package com.manikanta.Assignments;
import java.util.*;

//Take name as input and print a greeting message for that particular name.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class GreetingMessage {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name +" ! Have a Nice Day.");
    }
}
