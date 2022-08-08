package com.manikanta.Strings;

//https://leetcode.com/problems/robot-return-to-origin/

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "LLR";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }
    public static boolean judgeCircle(String moves){
        //if(moves.length()%2 != 0) return false;
        int cU = 0, cD = 0 , cL = 0, cR = 0;
        int n = moves.length();
        for (int i = 0; i < n; i++) {
            char ch = moves.charAt(i);
            if(ch == 'D') cD++;
            else if( ch == 'U') cU++;
            else if( ch == 'L') cL++;
            else cR++;
        }
        if(cU == cD && cL == cR) return true;
        return false;
    }
}
