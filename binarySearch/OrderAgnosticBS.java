package com.manikanta.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18, -11, -9, -2,-1, 0 , 4, 12, 22, 44, 83,100};
        int[] arr ={100 , 99, 87, 74, 57, 44,32, 21, 12, 3, -4};
        int target = 3;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean iaOA = arr[start] < arr[end];
        if(iaOA == true) {
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        else{
                while (start <= end ){

                    int mid = start + (end - start )/2;

                    if(arr[mid] == target) {
                        return mid;
                    }
                    else if (target > arr[mid]) {
                        end = mid - 1;
                    }
                    else if(target < arr[mid]) {
                        start = mid + 1;
                    }

                }
        }
    return -1;
}
}
