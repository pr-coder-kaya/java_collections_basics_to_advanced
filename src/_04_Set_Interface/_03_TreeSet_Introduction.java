package _04_Set_Interface;

import java.util.Iterator;
import java.util.TreeSet;

public class _03_TreeSet_Introduction {
    public static void main(String[] args) {

        //Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        //Adding objects to TreeSet
        numbers.add(5);
        numbers.add(15);
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);

        //Printing the TreeSet
        System.out.println(numbers); // [3, 5, 6, 7, 9, 15] - proves that there is sorted order

        //Getting the size of the TreeSet using size() method
        System.out.println(numbers.size()); // 6

        //Getting the first element using first() method
        System.out.println(numbers.first()); // 3

        //Getting the last element using last() method
        System.out.println(numbers.last()); // 15

        //Getting the elements less than 9 using headSet() method
        System.out.println(numbers.headSet(9)); // [3, 5, 6, 7]

        //Getting the elements more than or equal to 9 using tailSet() method
        System.out.println(numbers.tailSet(9)); // [9, 15]

        //Getting the elements more than or equal to 5 and less than 7 using subSet(element1, element2) method
        System.out.println(numbers.subSet(5, 7)); // [5, 6]

        //Getting the comparator used for the set using  comparator() method
        System.out.println(numbers.comparator()); // null -> as set uses the natural ordering of its elements.

        //Getting the element that is less than or equal to 10 using floor(element) method
        System.out.println(numbers.floor(10)); // 9

        //Getting the element that is more than or equal to 7 using ceiling(element) method
        System.out.println(numbers.ceiling(7)); // 7

        //Getting the highest element that is less than 10 using lower(element) method
        System.out.println(numbers.lower(10)); // 9

        //Getting the lowest element that is more than 6 using higher(element) method
        System.out.println(numbers.higher(6)); // 7

        //Retrieve and delete the first element using pollFirst() method
        System.out.println(numbers.pollFirst()); // 3
        System.out.println(numbers); // [5, 6, 7, 9, 15]

        //Retrieve and delete the last element using pollLast() method
        System.out.println(numbers.pollLast()); // 15
        System.out.println(numbers); // [5, 6, 7, 9]

        //Reverse order using descendingSet() method
        System.out.println(numbers.descendingSet()); // [9, 7, 6, 5]

        //Reverse ordered iterator using descendingIterator() method
        Iterator<Integer> it = numbers.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next()); // 9, 7, 6, 5
        }
    }
}
