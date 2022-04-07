package com.manikanta.binarySearch;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args){
        int[] numbers = {-1,0};
        int target = -1;
        int[] resIndices = twoSum(numbers, target);
        System.out.println(Arrays.toString(resIndices));
    }
    static int[] twoSum(int[] numbers, int target){
//        //first half the array at where number is greater than target
//        int start = 0,end = numbers.length;
//        if(numbers.length > 3) {
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if (numbers[mid] >= target && numbers[mid - 1] < target) {
//                    end = mid - 1;
//                    break;
//                } else if (numbers[mid] < target) {
//                    start = mid + 1;
//                }
//            }
//        }
//        //two sum checking
//        for(int i = 0 ; i < end ; i++){
//            for(int j = i + 1 ; j <= end ; j++){
//                if(numbers[i] + numbers[j] == target){
//                    return new int[] {i+1, j+1};
//                }
//            }
//        }
        int start = 0, end = numbers.length-1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[] {start+1, end+1};
            }
            else if(sum > target){
                end--;
            }
            else {
                start++;
            }
        }
        return new int[] {-1, -1};
    }
}
