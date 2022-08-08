package com.manikanta.Strings;

//https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        String ans = convertToTitle(columnNumber);
        System.out.println(ans);
    }
    public static String convertToTitle(int columnNumber) {
        String s = "";
        while(columnNumber > 0){
            columnNumber--;
            s = (char)('A'+columnNumber%26) +s;
            columnNumber/=26;
        }
        return s;
    }
}
