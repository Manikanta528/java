package com.manikanta.linkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(11);
//        list.insertFirst(24);
//        list.insertFirst(36);
//        list.insertLast(2);
//        list.insert(27,3);
//        System.out.println(list.find(24));
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(11);
        list.insertFirst(24);
        list.insertFirst(36);
        list.insertLast(43);
        list.insertLast(50);
        list.insert(43, 44);
        list.display();
    }
}
