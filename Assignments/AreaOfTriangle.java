package com.manikanta.Assignments;
import java.util.*;

//Area Of Triangle
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/03-conditionals-loops.md

public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and base of the triangle:");
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        float area = h*b/2;
        System.out.println("Area:"+area);
    }
}
