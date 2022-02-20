package com.manikanta.Assignments;
import java.util.*;

// Input currency in rupees and output in USD.
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class RupeesToUSD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees to Convert in USD :");
        float rupees = sc.nextFloat();
        float usd = (float)(rupees/74.68);
        System.out.println("USd : $"+usd);
    }
}
