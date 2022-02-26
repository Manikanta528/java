package com.manikanta.Assignments;

//Area Of Rectangle Program
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/03-conditionals-loops.md

import java.util.*;

public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of the rectangular:");
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        float area = l*w;
        System.out.println("Area: "+area);
    }
}
