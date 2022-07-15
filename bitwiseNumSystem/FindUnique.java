package com.manikanta.bitwiseNumSystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,4,5,2,2,1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int i : arr) unique ^=i;
        return unique;
    }
}
