package com.manikanta.Assignments;
import java.util.*;

//Area Of Circle Java Program
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/03-conditionals-loops.md

public class AreaOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int r = sc.nextInt();
        float area = (float)(Math.PI*(r*r));
        System.out.println("Area:"+area);
    }
}
