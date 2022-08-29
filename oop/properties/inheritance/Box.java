package com.manikanta.oop.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;
//    double weight;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.h = w;
        this.w = h;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.w;
        this.w = old.h;
    }

    public void information(){
        System.out.println("Running the Box");
    }

}
