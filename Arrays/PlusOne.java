package com.manikanta.Arrays;

//https://leetcode.com/problems/plus-one/

import java.util.*;

public class PlusOne {
    public static void main(String[] args){
        int[] digits = {1,9,9,9};
        int[] res = plusOne(digits);
        for(int num : res){
            System.out.print(num);
        }

    }
    static int[] plusOne(int[] digits){
        List<Integer> ans = new ArrayList<>();
        int k = 1;
        int sum = 0;
        for(int i = digits.length; i > 0; i--){
            if (k > 0){
                sum = sum + k + digits[i-1];
                ans.add(0, sum % 10);
                k = k /10;
            }else{
                sum = sum +digits[i-1];
                ans.add(0, sum % 10);
            }
            sum = sum / 10;
        }
        while(sum > 0){
            ans.add(0, sum % 10);
            sum = sum / 10;
        }
        int[] res = new int[ans.size()];
        for(int j = 0; j < res.length; j++){
            res[j] = ans.get(j);
        }

        return res;
    }
}
