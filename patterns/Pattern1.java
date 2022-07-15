package com.manikanta.patterns;

public class Pattern1 {
    public static void main(String args[]){
        pattern12(4);
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row = 1; row <=n ;row++){
            for(int col = 1; col <= n ;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col= 1; col <= n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){

            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        int c=0;
        for(int row = 1; row <= 2*n-1; row++){
            if(row <= n){
                for(int col = 1 ; col <= row; col++) {
                    System.out.print("* ");
                }
                c++;
                System.out.println();
            }

            else{
                for(int col = 1 ; col <= 2*n-1-c; col++){
                    System.out.print("* ");
                }
                c++;
                System.out.println();

            }
        }
    }
    static void pattern28(int n){

        for(int row = 1; row <= 2*n-1; row++){
            if(row <= n){
                for(int spaces = 1; spaces <= n-row; spaces++){
                    System.out.print(" ");
                }
                for(int col= 1 ; col<= row; col++){
                    System.out.print("* ");
                }

                System.out.println();
            }
            else{
                for(int spaces = 1; spaces <= row-n ; spaces++){
                    System.out.print(" ");
                }
                for(int col= 1 ; col <= 2*n-row; col++){
                    System.out.print("* ");
                }

                System.out.println();
            }

        }
    }
    static void pattern6(int n){
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++){
                System.out.print(" ");
            }
            for (int col=1; col <= row; col++ ){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern7(int n){
        for(int row = 1 ; row <= n; row++){
            for(int spaces = 1;spaces <= row-1; spaces++){
                System.out.print("\t");
            }
            for(int col = 1; col<= n-row+1; col++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        int flag = 1;
        for(int row =1; row <= n ;row++){
            for(int spaces=1; spaces <= n-row+1; spaces++){
                System.out.print(" ");
            }
            for(int col =1; col <= flag; col++){
                System.out.print("*");
            }
            flag+=2;
            System.out.println();
        }
    }
    static void pattern9(int n){

        for(int row = 0; row < n; row++){//for no. of rows
            for(int spaces = 0; spaces <= row; spaces++){
                System.out.print(" ");
            }
            for(int col= 0; col< 2*n-1-row-row; col++ ){
                System.out.print("*");
            }

            System.out.println();

        }
    }
    static void pattern12(int n){
        for(int row = 0; row <= 2*n-1; row++){
            if(row < n){
                for(int spaces = 0 ; spaces < row; spaces++){
                    System.out.print(" ");
                }
                for(int col = 0; col < n-row; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int spaces = 0; spaces <2*n-1-row; spaces++){
                    System.out.print(" ");
                }
                for(int col = 0; col < row-n+1; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

}
