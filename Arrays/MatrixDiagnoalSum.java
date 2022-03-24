package com.manikanta.Arrays;

//https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagnoalSum {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = diagnoalSum(matrix);
        System.out.println(ans);
    }
    static int diagnoalSum(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //for principal diagnoal
                if(i == j){
                    sum = sum + matrix[i][j];
                }//for Seconday diagnoal
                if((i+j == matrix.length-1) && !(i == j)){
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
}
// 00 01 02
// 10 11 12
// 20 21 22
