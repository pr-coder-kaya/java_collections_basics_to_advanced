package _02_List_Interface;

import java.util.ArrayList;

public class _02_ArrayList_More_Methods {
    public static void main(String[] args) {
        //Creating an ArrayList of String object
        ArrayList<String> us_cities = new ArrayList<>();
        ArrayList<String> eu_cities = new ArrayList<>();
        ArrayList<String> all_cities = new ArrayList<>();

        //Adding objects to ArrayList using add(object) method
        us_cities.add("Chicago");
        us_cities.add("Miami");

        eu_cities.add("Berlin");
        eu_cities.add("Paris");

        //Adding both us_cities and eu_cities objects into all_cities collection
        all_cities.addAll(us_cities);
        all_cities.addAll(eu_cities);

        //Printing all_cities collection
        System.out.println(all_cities); // [Chicago, Miami, Berlin, Paris]

        //Checking if all_cities contains eu_cities
        System.out.println(all_cities.containsAll(eu_cities)); // true

        //Removing all us_cities from all_cities
        all_cities.removeAll(us_cities);

        //Printing all_cities collection
        System.out.println(all_cities); // [Berlin, Paris]

        //Adding more objects to all_cities element
        all_cities.add("Istanbul");
        all_cities.add("Brugge");
        all_cities.add("Toronto");
        System.out.println(all_cities); // [Berlin, Paris, Istanbul, Brugge, Toronto]

        //Remove all cities that starts with letter B using removeIf() method
        all_cities.removeIf(x -> x.toLowerCase().startsWith("b"));
        System.out.println(all_cities); // [Paris, Istanbul, Toronto]
    }
}
