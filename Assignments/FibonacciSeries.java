package com.manikanta.Assignments;
import java.util.*;

//To calculate Fibonacci Series up to n numbers.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class FibonacciSeries {
    public static void main(String args[]){
        System.out.print("Enter a number other than 0 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 3; i <= num ; i++){
            res = a + b;
            System.out.print(res+" ");
            a = b;
            b = res;
        }

    }
}
