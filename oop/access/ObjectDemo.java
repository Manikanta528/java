package com.manikanta.oop.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }
    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //already covered these 2
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34,54.68f);
        ObjectDemo obj2 = new ObjectDemo(34,78.4f);

        if(obj == obj2 ){
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("obj num is equals to obj2 num");
        }
        System.out.println(obj.getClass().getName());
    }
}
