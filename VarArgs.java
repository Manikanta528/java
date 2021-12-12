package com.manikanta;
import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
//       fun(2, 3934, 404, 5843, 4939, 494, 58393, 45);
        fun(20,30,"hello ", "world ", "! ");
    }
    static void fun(int a, int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
}
