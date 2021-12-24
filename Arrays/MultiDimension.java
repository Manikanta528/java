package com.manikanta.Arrays;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];
//
//        int[][] arr2d = {
//                {1, 2, 3},  //0th index
//                {4, 5},     //1st index
//                {6, 7, 8, 9} //2nd index
//        };
        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
        for(int[] n : arr){
            System.out.println(Arrays.toString(n));
        }
    }
}
