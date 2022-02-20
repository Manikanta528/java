package com.manikanta.Assignments;

import java.util.Scanner;

public class LCMandHCF {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcfAns = hcfFinder(a, b);
        int lcmAns = a*b/hcfAns;
        System.out.println("LCM:"+lcmAns+"  "+"HCF:"+hcfAns);
    }
    static int hcfFinder(int a, int b){
        int minnum = 0;
        int result = -1;
        if(a>b){
            minnum = b;
        }
        else{
            minnum = a;
        }
        for(int i = 1; i <= minnum; i++){
            if(a % i == 0 && b % i ==0){
                result = i;
            }
        }
        return result;
    }

}
