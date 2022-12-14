package _04_Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class _01_HashSet_Introduction {
    public static void main(String[] args) {

        //Creating a HashSet
        HashSet<String> hs = new HashSet();

        //Adding objects to HashSet
        hs.add("John");
        hs.add("John"); // will not be added as duplicates are not allowed
        hs.add("Max");
        hs.add(null);
        hs.add(null); // will not be added as duplicates are not allowed

        //Printing the HashSet
        System.out.println(hs); // [null, Max, John] - proves that there is no insertion order

        //Getting the size of the HashSet using size() method
        System.out.println(hs.size()); // 3

        //Checking if the HashSet contains an object using contains() method
        System.out.println(hs.contains("John")); // true
        System.out.println(hs.contains("Mike")); // false

        //Checking if the HashSet is empty using isEmpty() method
        System.out.println(hs.isEmpty()); // false

        //Creating an Integer HashSet in the shape of Set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        //Printing each object in the HashSet using enhanced for loop
        System.out.println("\n-------------------------------------\n");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //Printing each object in the HashSet using forEach() method
        System.out.println("\n-------------------------------------\n");
        numbers.forEach(System.out::println);
    }
}
