package com.manikanta.functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //Q : take input of two numbers and print the sum
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(40, 50);
        System.out.println(ans);
}
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int sum2(){
        int num1, num2, sum ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        num1 = in.nextInt();
        System.out.print("Enter second number :");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;

    }

    static void sum(){
        int num1, num2, sum ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = in.nextInt();
        System.out.println("Enter second number :");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("sum :"+sum);

    }


    /*


     return_type name (arguments){
     //body
     return statement;
     }


     */
}
