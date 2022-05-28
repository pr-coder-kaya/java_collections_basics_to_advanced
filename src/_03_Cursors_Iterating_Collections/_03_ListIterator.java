package _03_Cursors_Iterating_Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class _03_ListIterator {
    public static void main(String[] args) {
        /*
        ListIterator is only applicable for list implemented classes like ArrayList, LinkedList, Stack, etc.
        So, let's create a LinkedList collection object and see how to iterate it using ListIterator.
         */

        //Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        //Adding objects to LinkedList using add(object) method
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        //Printing the LinkedList
        System.out.println(list); // [5, 6, 7, 8, 9, 10]

        //Creating ListIterator using listIterator() method
        ListIterator<Integer> listIterator = list.listIterator();

        /*
        TASK TO EXECUTE
        If an object in the LinkedList is divided by 2, then remove it
        If an object in the LinkedList is divided by 5, then replace it with -1
        If an object in the LinkedList is divided by both 2 and 5, then add an 100 next to it
         */

        //Retrieving or reading each element in the LinkedList and manipulating them with the given requirements
        while(listIterator.hasNext()){
            int object = listIterator.next();
            System.out.println(object);
            if(object % 2 == 0 && object % 5 == 0) listIterator.add(100);
            else if(object % 5 == 0) listIterator.set(-1);
            else if(object % 2 == 0) listIterator.remove();
        }
        /*
        EXPECTED OUTPUT:
        5
        6
        7
        8
        9
        10
         */

        //Printing the LinkedList
        System.out.println(list); // [-1, 7, 9, 10, 100]
    }
}
