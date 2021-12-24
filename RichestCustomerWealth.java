package com.manikanta;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {3,5},
                {7,3}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int[] totalWealth = new int[accounts.length];
        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                wealth = wealth + accounts[row][col];
            }
            totalWealth[row] = wealth;
            if(maxWealth < totalWealth[row]){
                maxWealth = totalWealth[row];
            }
        }
//        for (int i = 0; i < totalWealth.length; i++) {
//            if(maxWealth < totalWealth[i]){
//                maxWealth = totalWealth[i];
//            }
//        }
        return maxWealth;
    }
}
