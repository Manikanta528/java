package com.manikanta.Arrays;

//https://leetcode.com/problems/flipping-an-image/

public class FlippingAnImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] reverseImage = flipAndInvertImage(image);
        for(int[] k: reverseImage){
            for(int z : k){
                System.out.print(z +" ");
            }
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        int[][] ans = new int[image.length][image[0].length];
        for(int i = 0; i < ans.length; i++){
            int flag = 0;
            for(int j = ans[0].length-1; j >= 0; j--){
                ans[i][flag] = (image[i][j] == 1) ? 0:1;
                flag++;
            }
        }
        return ans;
    }
}
