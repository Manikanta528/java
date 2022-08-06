package com.manikanta.Arrays;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> res = luckyNumbers(matrix);
        System.out.println(res);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int rowlen = matrix.length, collen = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < rowlen; i++){
            int minInd = 0;
            for (int j = 0; j < collen; j++) {
                //System.out.println(matrix[i][minInd] +" "+ matrix[i][j]);
                if(matrix[i][minInd] > matrix[i][j]){
                    minInd = j;
                }
            }
            int flag = 0;
            for (int k = 0; k < rowlen; k++) {
                if(matrix[k][minInd] <= matrix[i][minInd]){
                    flag++;
                }else{
                    break;
                }
            }
            if(flag == rowlen){
                list.add(matrix[i][minInd]);
                break;
            }
        }
        return list;
    }

}
