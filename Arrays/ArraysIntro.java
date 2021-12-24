package com.manikanta.Arrays;


import java.util.*;

public class ArraysIntro {
    public static void main(String[] args) {
//        int[] arr ;
//        arr = new int[5];
//        System.out.println(arr[0]);
//        String[] arr1 = new String[5];
//        System.out.println(arr1[0]);
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        for(int num : arr){
//            System.out.print(num+" ");
//        }
        System.out.println(Arrays.toString(arr));

    }
}
