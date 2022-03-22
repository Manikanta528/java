package com.manikanta.Arrays;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/


import java.util.*;

public class GreatestNumberOfCandies {
    public static void main (String args[]){
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies( candies, extraCandies);
        System.out.println(result);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> arr = new ArrayList<Boolean>();
        int maxElement = 0;
        for(int i = 0; i < candies.length; i++){
            if(maxElement < candies[i]){
                maxElement = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= maxElement){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
            candies[i] = candies[i] - extraCandies;
        }
        return arr;
    }
}
