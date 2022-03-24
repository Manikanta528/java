package com.manikanta.Arrays;

//https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] ans = transpose(matrix);
        for(int[] m : ans){
            for(int n : m){
                System.out.print(n +" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] matrix){
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
