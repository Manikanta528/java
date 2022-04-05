package com.manikanta.Arrays;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

public class MatrixRotation {
    public static void main (String[] agrs){
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }
    static boolean check(int[][] matrix, int[][] target){
        int len = matrix.length;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < len ; j++){
                if(matrix[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    static int[][] transpose(int[][] matrix){
        int len = matrix.length;
        int[][] ans = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                ans[j][len-i-1] = matrix[i][j];
            }
        }
        return ans;
    }

    static boolean findRotation(int[][] mat, int[][] target){
        if(check(mat, target) == true) return true;
        int len = mat.length;
        int[][] temp = new int[len][len];
        for(int i = 0; i < 4; i++){
            temp = transpose(mat);
            if(check(temp, target) == true) return true;
            mat = temp;
        }
        return false;
    }
}
