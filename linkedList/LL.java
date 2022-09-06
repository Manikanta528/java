package com.manikanta.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node  = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node pre = get(index -1);
        int val = pre.next.value;

        pre.next = pre.next.next;

        return val;
    }

    public Node find(int val){
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
