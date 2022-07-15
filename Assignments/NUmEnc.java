package com.manikanta.Assignments;

import java.util.*;

public class NUmEnc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n= s.length();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Character.getNumericValue(s.charAt(i));
        }
        String change= sc.nextLine();
        int l = change.length();
        int index=0;
        for(int i=0;i<l;i++){
//            System.out.println(arr[index]);
            if(change.charAt(i)=='R'){
               if(index+1<n) index++;
            }
            else if(change.charAt(i)=='L'){
                if(index>0)index--;
            }
            else if(change.charAt(i)=='T'){
                if(arr[index]<9)arr[index]++;
            }
            else if(change.charAt(i)=='D'){
                if(arr[index]>0)arr[index]--;
            }
            else if(change.charAt(i)=='S'){

                i++;
                int x=i;
                while(i<l&&Character.isDigit(change.charAt(i))){
                    i++;
                }i--;
//                System.out.println("x, i"+x+" "+i);
//                System.out.println(change.substring(x,i+1));
                int swapind= Integer.valueOf(change.substring(x,i+1));

//
//                    System.out.println("x="+x);
//                System.out.println("index="+index);
                int temp=arr[swapind-1];
                arr[swapind-1]=arr[index];
                arr[index]=temp;

            }
//            System.out.print(change.charAt(i)+" ");
//            for(int k:arr){
//                System.out.print(k+" ");
//            }
//            System.out.println("\n");
        }
        for(int k:arr){
            System.out.print(k);
        }
    }
}
