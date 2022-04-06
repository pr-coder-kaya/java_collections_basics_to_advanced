package _02_List_Interface;

import java.util.LinkedList;

public class _03_LinkedList_Introduction {
    public static void main(String[] args) {

        /*
        LinkedList implements all methods from List Interface same as ArrayList
        It also implements Queue Interface and provides method implementation to Queue abstract methods as well
         */

        //Creating a LinkedList
        LinkedList<String> ll = new LinkedList<>();

        //Adding objects to LinkedList using add(object) method
        ll.add("John");
        ll.add("Max");
        ll.add("Leo");

        //Printing the LinkedList
        System.out.println(ll); // [John, Max, Leo]

        //Adding and object to LinkedList using addFirst() method - it adds to the index of 0
        ll.addFirst("Mike");
        System.out.println(ll); // [Mike, John, Max, Leo]

        //Adding and object to LinkedList using addLast() method - it adds it as last element
        ll.addLast("Jessie");
        System.out.println(ll); // [Mike, John, Max, Leo, Jessie]

        //Retrieving the first element from the LinkedList using getFirst() method
        System.out.println(ll.getFirst()); // Mike

        //Retrieving the last element from the LinkedList using getLast() method
        System.out.println(ll.getLast()); // Jessie

        //Removing the first element at index of 0 using removeFirst() method
        ll.removeFirst(); // Mike
        System.out.println(ll); // [John, Max, Leo, Jessie]

        //Removing the last element using removeLast() method
        ll.removeLast(); // Jessie
        System.out.println(ll); // [John, Max, Leo]

        System.out.println("\n----------peekFirst() and peekLast() methods--------------\n");
        //Retrieving the first element from the head using peekFirst() method - this method does not remove the element
        //it returns null if the list is empty
        System.out.println(ll.peekFirst()); // John
        System.out.println(ll); // [John, Max, Leo]

        //Retrieving the last element from the list using peekLast() method - this method does not remove the element
        //it returns null if the list is empty
        System.out.println(ll.peekLast()); // Leo
        System.out.println(ll); // [John, Max, Leo]

        System.out.println("\n----------pollFirst() and pollLast() methods--------------\n");
        //Retrieving the first element from the head using pollFirst() method - this method removes the element
        //it returns null if the list is empty
        System.out.println(ll.pollFirst()); // John
        System.out.println(ll); // [John, Max, Leo]

        //Retrieving the last element from the list using peekLast() method - this method removes the element
        //it returns null if the list is empty
        System.out.println(ll.pollLast()); // Leo
        System.out.println(ll); // [Max]
    }
}
