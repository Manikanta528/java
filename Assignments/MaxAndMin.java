package com.manikanta.Assignments;
import java.util.*;

public class MaxAndMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers to find Min and Max among them:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        minnum(num1, num2, num3);
        maxnum(num1, num2, num3);
    }
    static void minnum(int num1, int num2, int num3){
        if(num1 <= num2 && num1 <= num3){
            System.out.println("min: "+num1);
        }
        else if(num2 <= num1 && num2 <= num3){
            System.out.println("min: "+num2);
        }
        else{
            System.out.println("min: "+num3);
        }
    }
    static void maxnum(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3){
            System.out.println("max: "+num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("max: "+num2);
        }
        else{
            System.out.println("max: "+num3);
        }
    }
}
