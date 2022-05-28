package _03_Cursors_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _04_Iterator_vs_ForEach_Loop {
    public static void main(String[] args) {
        /*
        TASK
        Create a collection to store below cities
        Remove all cities that starts with P letter

        Test Data: ["Paris", "Chicago", "Brugge", "Porto"]
        Expected Output: ["Chicago", "Brugge"]
         */

        //Creating an ArrayList to store city objects
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "Chicago", "Brugge", "Porto"));

        //Printing the ArrayList
        System.out.println(cities); // [Paris, Chicago, Brugge, Porto]

        //For each loop to try removing elements which starts with P letter
        for (String city : cities) {
            // if(city.startsWith("P")) cities.remove(city); // This line throws ConcurrentModificationException as size changes when you remove Paris
        }

        //Creating Iterator using iterator() method
        Iterator<String> it = cities.iterator();

        //Retrieving or reading each element in the ArrayList and removing object that starts with P letter using Iterator methods with while loop
        while(it.hasNext()){
            String city = it.next();
            if(city.startsWith("P")) it.remove();
        }

        //Printing the ArrayList
        System.out.println(cities); // [Chicago, Brugge]

    }
}
