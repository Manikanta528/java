package com.manikanta.Assignments;

import java.util.Scanner;

public class SumOfAllNums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char flag = 'y';
        while(flag != 'x'){
            System.out.print("Enter a number to get sum : ");
            int temp = sc.nextInt();
            sum = sum + temp;
            System.out.print("Enter x to stop || Enter any other letter to continue :");
            flag = sc.next().charAt(0);
        }
        System.out.println("sum of all is :"+sum);
    }
}
