package com.manikanta.Recursion.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean board[][] = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
//        allpaths("",board,0,0);
        allpathsPrint("",board,0,0,path,1);
    }
    static void allpathsPrint(String p ,boolean[][] mat, int r , int c,int[][] path,int step){
        if(r == mat.length - 1 && c == mat[0].length - 1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!mat[r][c]){
            return;
        }

        mat[r][c] = false;
        path[r][c] = step;

        if(r >  0){
            allpathsPrint(p+'U',mat,r-1,c,path, step+1);
        }
        if(c > 0){
            allpathsPrint(p+'L',mat, r, c-1,path, step+1);
        }
        if(r <  mat.length -1){
            allpathsPrint(p+'D',mat,r+1,c,path, step+1);
        }
        if(c < mat[0].length - 1){
            allpathsPrint(p+'R',mat, r, c+1,path, step+1);
        }
        mat[r][c] = true;
        path[r][c]= 0;
    }
    static void allpaths(String p ,boolean[][] mat, int r , int c){
        if(r == mat.length - 1 && c == mat[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!mat[r][c]){
            return;
        }

        mat[r][c] = false;

        if(r >  0){
            allpaths(p+'U',mat,r-1,c);
        }
        if(c > 0){
            allpaths(p+'L',mat, r, c-1);
        }
        if(r <  mat.length -1){
            allpaths(p+'D',mat,r+1,c);
        }
        if(c < mat[0].length - 1){
            allpaths(p+'R',mat, r, c+1);
        }
        mat[r][c] = true;
    }
}
