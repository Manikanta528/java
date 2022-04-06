package com.manikanta.binarySearch;

//https://leetcode.com/problems/guess-number-higher-or-lower/
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {

    }
    static int guessNumber(int n){
        int start = 1, end = n;
        while(start <= end ){
            int mid = start + (end -start) / 2;
            int guess = guess(mid);
            if(guess == 0) return mid;
            else if (guess == 1 ){//num < pick
                start = end -1;
            }
            else{//num > pick
                end = start + 1;
            }
        }
        return -1;
    }
}
