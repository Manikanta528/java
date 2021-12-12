package com.manikanta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("pulp fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("Enter a valid input");
        }
    }
}
