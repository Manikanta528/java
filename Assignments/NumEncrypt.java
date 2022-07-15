package com.manikanta.Assignments;

import java.util.*;

public class NumEncrypt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n= s.length();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)s.charAt(i)-(int)'0';
        }
        String change= sc.nextLine();
        int l = change.length();
        int index=0;
        for(int i=0;i<l;i++){
//            System.out.println(arr[index]);
            if(change.charAt(i)=='R'){
                index++;
            }
            else if(change.charAt(i)=='L'){
                index--;
            }
            else if(change.charAt(i)=='T'){
                if(arr[index]<9)arr[index]++;
            }
            else if(change.charAt(i)=='D'){
                if(arr[index]>0)arr[index]--;
            }
            else if(change.charAt(i)=='S'){
                    int x=0;
                    i++;
                    while(i<l&&Character.isDigit(change.charAt(i))){

//                        System.out.println("x="+x);
                        x=x*10+((int)change.charAt(i)-(int)'0');
//                        System.out.println("x="+x);
//                        System.out.println("i="+i);
                        i++;
                    }i--;
//                    System.out.println("HEllo");
//                    System.out.println("x="+x);
//                System.out.println("index="+index);
                    int temp=arr[x-1];
                    arr[x-1]=arr[index];
                    arr[index]=temp;

            }
//            System.out.print(change.charAt(i)+" ");
//            for(int k:arr){
//                System.out.print(k+" ");
//            }
//            System.out.println("\n");
        }
        StringBuilder res = new StringBuilder(arr.length);
        for(int i = 0; i < arr.length; i++){
            res.append(arr[i]);
        }
        System.out.print(res);
    }
}
