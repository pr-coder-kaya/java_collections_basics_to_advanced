package _02_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class _01_ArrayList_Introduction {
    public static void main(String[] args) {

        //Creating an ArrayList
        ArrayList<String> al = new ArrayList<>();

        //Adding objects to ArrayList using add(object) method
        al.add("John");
        al.add("Max");
        al.add("Leo");

        //Printing the ArrayList
        System.out.println(al); // [John, Max, Leo]

        //Adding objects to ArrayList using add(index, object) method
        al.add(1, "Mike");

        //Printing the ArrayList
        System.out.println(al); // [John, Mike, Max, Leo]

        //Removing objects from ArrayList
        al.remove("Max"); // removing object
        al.remove(0); // removing with index

        //Printing the ArrayList
        System.out.println(al); // [Mike, Leo]

        //Retrieving objects from the ArrayList using get(index) method
        System.out.println(al.get(0)); // Mike
        System.out.println(al.get(1)); // Leo

        //Getting the size of the ArrayList using size() method
        System.out.println(al.size()); // 2

        //Checking if the ArrayList contains an object using contains() method
        System.out.println(al.contains("Mike")); // true
        System.out.println(al.contains("Jessie")); // false

        //Checking if the ArrayList is empty using isEmpty() method
        System.out.println(al.isEmpty()); // false

        //Clearing the ArrayList - removing all elements using clear() method
        al.clear();
        System.out.println(al.isEmpty()); // true
        System.out.println(al.size()); // 0
        System.out.println(al); // []

        //Creating an Integer ArrayList in the shape of List
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        //Printing each object in the ArrayList using enhanced for loop
        System.out.println("\n-------------------------------------\n");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //Printing each object in the ArrayList using for-i loop
        System.out.println("\n-------------------------------------\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //Printing each object in the ArrayList using forEach() method
        System.out.println("\n-------------------------------------\n");
        numbers.forEach(System.out::println);
    }
}
