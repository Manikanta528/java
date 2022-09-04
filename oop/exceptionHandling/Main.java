package com.manikanta.oop.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            divide(a,b);

            //mimicking
            String name = "Mani";
            if(name.equals("Mani")){
                throw new MyException("name is Mani");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Normal Exception");
        } catch (Exception e){
            System.out.println("Normal Exception");
        }finally {
            System.out.println("this will always execute");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
