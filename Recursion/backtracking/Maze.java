package com.manikanta.Recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathRetDiagonal("",3,3));
        boolean board[][] = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);
    }
    static int mazeCount(int r, int c){
        if(r == 1 || c == 1 ){
            return 1;
        }
        int left = mazeCount(r-1,c);
        int right = mazeCount(r,c-1);
        return left+right;
    }
    static void path(String p , int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p+'D',r-1,c);
        }
        if(c > 1){
            path(p+'R', r, c-1);
        }
    }
    static ArrayList<String> pathRet(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathRet(p+'D',r-1,c));
        }
        if(c > 1){
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p+'D',r-1,c-1));
        }
        if(r > 1){
            list.addAll(pathRetDiagonal(p+'V',r-1,c));
        }
        if(c > 1){
            list.addAll(pathRetDiagonal(p+'H', r, c-1));
        }
        return list;
    }

    static void pathRestrictions(String p ,boolean[][] mat, int r , int c){
        if(r == mat.length - 1 && c == mat[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!mat[r][c]){
            return;
        }
        if(r <  mat.length -1){
            pathRestrictions(p+'D',mat,r+1,c);
        }
        if(c < mat[0].length - 1){
            pathRestrictions(p+'R',mat, r, c+1);
        }
    }
}
