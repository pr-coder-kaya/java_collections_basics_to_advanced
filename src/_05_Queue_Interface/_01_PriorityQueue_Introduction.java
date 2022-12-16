package _05_Queue_Interface;

import java.util.PriorityQueue;

public class _01_PriorityQueue_Introduction {
    public static void main(String[] args) {

        //Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Adding objects to PriorityQueue using add() method
        pq.add(10);
        pq.add(10);
        pq.add(15);
        pq.add(5);

        //Printing the PriorityQueue
        System.out.println(pq); // [5, 10, 15, 10] -> proves that insertion order is not preserved

        //Adding objects to PriorityQueue using offer() method
        pq.offer(12);
        System.out.println(pq); // [5, 10, 15, 10, 12]

        //Removing the head element using remove() method
        System.out.println(pq.remove()); // 5
        System.out.println(pq); // [10, 10, 15, 12]

        //Retrieving the head element and deleting it using poll() method
        System.out.println(pq.poll()); // 10
        System.out.println(pq); // [10, 12, 15]

        //Retrieving the head element without deleting using element() method
        System.out.println(pq.element()); // 10
        System.out.println(pq); // [10, 12, 15]

        ////Retrieving the head element without deleting using peek() method
        System.out.println(pq.peek()); // 10
        System.out.println(pq); // [10, 12, 15]
    }
}
