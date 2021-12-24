package com.manikanta;
import java.util.*;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] arr ={12, 345, 2, 6, 7896};
        System.out.println(evenNum(arr));
    }
    static int evenNum(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int countdigit =0;
            int n = arr[i];
            while(n > 0){
                n = n / 10;
                countdigit++;
            }
            if(countdigit % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
