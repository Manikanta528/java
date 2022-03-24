package com.manikanta.Arrays;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class CallOddCells {
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        int res = oddCells(m, n, indices);
        System.out.print(res);
    }

    static int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < indices[i].length; j++){
                if(j == 0){
                    int row = indices[i][j];
                    for(int k = 0; k < n; k++){
                        matrix[row][k] ++;
                    }
                }
                else{
                    int col = indices[i][j];
                    for(int k = 0; k < m; k++){
                        matrix[k][col] ++;
                    }
                }
            }
        }
        int count = 0;
        for(int[] r : matrix){
            for(int c : r){
                if( c % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
