package com.manikanta.binarySearch;

//https://leetcode.com/problems/first-bad-version/

//public class FirstBadVersion {
//    public static void main(String[] args){
//
//    }
//    static int firstBadVersion(int n){
//        int start = 1, end = n;
//        while(start <= end){
//            int mid = start + (end- start) /2;
//            boolean badV = isBadVersion(mid);
//            boolean badPreV = isBadVersion(mid-1);
//            if(badV == true && badPreV == false) return mid;
//            else if(badV == false){
//                start = mid + 1;
//            }
//            else{
//                end = mid -1;
//            }
//
//        }
//        return -1;
//    }
//}
