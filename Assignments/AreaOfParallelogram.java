package com.manikanta.Assignments;

//Area Of Parallelogram
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/03-conditionals-loops.md

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of a parallelogram: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int area = b*h;
        System.out.println("Area: "+area);
    }

}
