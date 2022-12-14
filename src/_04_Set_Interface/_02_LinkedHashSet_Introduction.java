package _04_Set_Interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class _02_LinkedHashSet_Introduction {
    public static void main(String[] args) {
        //Creating a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet();

        //Adding objects to LinkedHashSet
        lhs.add("John");
        lhs.add("John"); // will not be added as duplicates are not allowed
        lhs.add("Max");
        lhs.add(null);
        lhs.add(null); // will not be added as duplicates are not allowed

        //Printing the LinkedHashSet
        System.out.println(lhs); // [John, Max, null] - proves that there is insertion order

        //Getting the size of the LinkedHashSet using size() method
        System.out.println(lhs.size()); // 3

        //Checking if the LinkedHashSet contains an object using contains() method
        System.out.println(lhs.contains("John")); // true
        System.out.println(lhs.contains("Mike")); // false

        //Checking if the LinkedHashSet is empty using isEmpty() method
        System.out.println(lhs.isEmpty()); // false

        //Creating an Integer LinkedHashSet in the shape of Set
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        //Printing each object in the LinkedHashSet using enhanced for loop
        System.out.println("\n-------------------------------------\n");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //Printing each object in the LinkedHashSet using forEach() method
        System.out.println("\n-------------------------------------\n");
        numbers.forEach(System.out::println);
    }
}
