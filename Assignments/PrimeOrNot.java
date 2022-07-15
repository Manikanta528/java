package com.manikanta.Assignments;
import java.util.*;

//Define a method to find out if a number is prime or not.

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it Prime or not :");
        int num = sc.nextInt();
        primeOrNot(num);
    }
    static void primeOrNot(int num) {
        if(num == 1){
            System.out.println(" 1 is neither prime nor composite");
        }
        else{
            int count = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count += 1;
                }
            }
            if (count == 0) {
                System.out.println(num + " is Prime number.");
            } else {
                System.out.println(num + " is Not a Prime number.");
            }
        }
    }
}
