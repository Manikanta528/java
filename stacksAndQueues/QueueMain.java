package com.manikanta.stacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(51);
        queue.insert(7);
        queue.insert(24);
        queue.insert(8);
        queue.insert(29);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

    }
}
