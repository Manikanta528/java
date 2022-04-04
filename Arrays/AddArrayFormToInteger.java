package com.manikanta.Arrays;

//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;

public class AddArrayFormToInteger {
    public static void main(String[] args){
        int[] num = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        List<Integer> res = addToArrayForm(num, k);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }
    static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for(int i = num.length; i > 0; i--){
            if(k > 0){
                sum = sum + k % 10 + num[i-1];
                ans.add(0,sum % 10);
                k= k / 10;
            }
            else{
                sum = sum + num[i-1];
                ans.add(0, sum % 10);
            }
            sum = sum / 10;
        }
        while(sum > 0 || k > 0){
            sum = sum + k % 10;
            ans.add(0, sum%10);
            sum = sum / 10;
            k = k / 10;
        }
        return ans;
    }


    /*static List<Integer> addToArrayForm(int[] num, int k){
        // for number of k digits
        int kDigits = 0,rem0 = 0,number = k;
        while(number!= 0){
            rem0 = rem0 %10;
            kDigits = kDigits +1;
            number = number / 10;
        }

        int len = num.length - 1;
        int range = (kDigits < len +1) ? len - kDigits -1 : 0;
        //for finding last array number to add with k
        StringBuilder s = new StringBuilder();

        for(int i = range ; i <= len; i++){
            s.append(num[i]);

        }
        //System.out.println(s);
        int arrayNum = Integer.parseInt(s.toString());
        arrayNum = arrayNum + k;
        //System.out.println(arrayNum);


        List<Integer> tempList = new ArrayList<>();
        int rem = 0;
        while(arrayNum > 0){
            rem = arrayNum % 10;
            tempList.add(0, rem);
            arrayNum = arrayNum / 10;
        }
//        for (int i = 0; i < tempList.size(); i++) {
//            System.out.print(tempList.get(i)+" ");
//        }
//        System.out.println();


        List<Integer> actualNum = new ArrayList<>();
        for(int i = 0 ; i < range; i++){
            actualNum.add(i,num[i]);
        }
//        for (int i = 0; i < actualNum.size(); i++) {
//            System.out.print(actualNum.get(i)+" ");
//        }
//        System.out.println();
        actualNum.addAll(tempList);

        return actualNum;
    }*/

}
