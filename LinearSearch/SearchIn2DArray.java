package com.manikanta.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {28, 9 ,36 },
                {44 ,2 ,43 ,24},
                {3, 5, 20, 45},
                {44, 19 }
        };
        int target = 43; //search element
        int[] ans = search(arr ,target); // format of answer is {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        //int[] index = {-1 ,-1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
//                    index[0] = i;
//                    index[1] = j;
//                    return index;
                    return new int[]{row, col};
                }
            }


        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int maxitem = arr[0][0];
        for( int row = 0 ; row < arr.length ; row++){
            for( int col =0 ; col < arr[row].length ; col++ ){
                if(maxitem < arr[row][col]) {
                    maxitem = arr[row][col];
                }
            }
        }
        return maxitem;
    }
}
