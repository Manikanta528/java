package com.manikanta.Arrays;
import java.util.*;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] arr = {1, 11, 111, 1111, 11111};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=2;
    }
}
