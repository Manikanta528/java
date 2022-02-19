package com.manikanta.Assignments;
import java.util.*;
public class SumOfTwoNums {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two nums is : "+ sum);
    }
}
