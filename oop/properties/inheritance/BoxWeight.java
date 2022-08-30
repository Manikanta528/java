package com.manikanta.oop.properties.inheritance;



public class BoxWeight extends Box{
    double weight;

    public static void greeting(){
        System.out.println("Hey i am in BoxWeight Class");
    }

    public BoxWeight(){
        this.weight  = -1;
    }

    public BoxWeight(double l, double w, double h,double weight){
        super(l,w,h);// call the parent class constructor
        // used to initialize  values present in parent class

//        System.out.println(super.weight);
        this.weight = weight;
        super.information();
    }
    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        this.weight = other.weight;
    }
}
