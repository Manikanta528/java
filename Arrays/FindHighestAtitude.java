package com.manikanta.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/
import java.util.*;

public class FindHighestAtitude {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        int highAlt = largestAltitude(gain);
        System.out.print(highAlt);
    }
    static int largestAltitude(int[] gain){
        int[] netGain = new int[gain.length+1];
        netGain[0] = 0;
        for(int i = 0; i < netGain.length; i++){
            if(i < netGain.length-1){
                netGain[i+1] = netGain[i] + gain[i];
            }
        }
        Arrays.sort(netGain);
        return netGain[netGain.length-1];
    }
}
