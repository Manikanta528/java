package com.manikanta.sorting;

public class FindTheDuplicateNum {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    static int findDuplicate(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return -1;
    }
}
