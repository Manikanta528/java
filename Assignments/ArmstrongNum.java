package com.manikanta.Assignments;
import java.util.*;

//To find Armstrong Number between two given number.
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md

public class ArmstrongNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive numbers to find armstrong number b/w them:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if( n1 < 0 || n2 < 0 ){
            System.out.println("negative integers");
        }
        else{
            if(n1>n2){
                armstrong(n2, n1);

            }
            else{
                armstrong(n1,n2);
            }
        }
        
    }
    static void armstrong(int start ,int end){
        for(int i = start; i <= end;i++){
            int temp =i,rem=0,res=0;
            while(temp>0){
                rem = temp % 10;
                res = res + (rem*rem*rem);
                temp = temp/10;
            }
            if(res == i){
                System.out.print(res+" ");
            }
        }
    }
}
