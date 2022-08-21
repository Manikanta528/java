package com.manikanta.Recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }
    static  int queens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            //place the queen if it safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //diagonal left
        int maxLef = Math.min(row, col);
        for (int i = 1; i <= maxLef; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        //diagonal right
        int maxRig = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRig; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}
