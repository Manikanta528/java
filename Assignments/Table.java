package com.manikanta.Assignments;
import java.util.*;
public class Table {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        for(int i = 1; i <= 20; i++){
            System.out.println(num+" * "+i+" = "+i*num);
        }
    }
}
