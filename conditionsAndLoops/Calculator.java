package com.manikanta.conditionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a operator:");
            char op = in.next().trim().charAt(0);
            int ans = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (num2 == 0) {
                    if (op == '/') {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                } else if (op == 'X' || op == 'x') {
                break;
                } else {
                System.out.println("Invalid Operation");
                }
            System.out.println(ans);
        }



    }
}

