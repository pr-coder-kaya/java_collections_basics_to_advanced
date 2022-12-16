package _06_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class _01_HashMap_Introduction {
    public static void main(String[] args) {

        //Creating a HashMap
        HashMap<String, String> states = new HashMap<>();

        //Adding key-value pairs using put(key, value) method
        states.put("IL", "Illinois");
        states.put("WI", "Wisconsin");
        states.put("CA", "California");

        //Printing the HashMap
        System.out.println(states); // {WI=Wisconsin, IL=Illinois, CA=California}

        //Retrieving value for the given key using get(key) method
        System.out.println(states.get("IL")); // Illinois
        System.out.println(states.get("MI")); // null -> as there is no such mapping with key = MI

        //Get size of the HashMap using size() method
        System.out.println(states.size()); // 3

        //Check if the HashMap is empty using isEmpty() method
        System.out.println(states.isEmpty()); // false

        //Check if the HashMap contains given key using containsKey() method
        System.out.println(states.containsKey("WI")); // true
        System.out.println(states.containsKey("NY")); // false

        //Check if the HashMap contains given value using containsValue() method
        System.out.println(states.containsValue("California")); // true
        System.out.println(states.containsValue("Michigan")); // false

        //Remove a key-value pair using remove(key) method
        System.out.println(states.remove("IL")); // Illinois
        System.out.println(states.remove("MN")); // null -> -> as there is no such mapping with key = MN
        System.out.println(states); // {WI=Wisconsin, CA=California}

        //Retrieve all the keys as a Set using keySet() method
        System.out.println(states.keySet()); // [WI, CA]

        //Retrieve all the values as a Collection using values() method
        System.out.println(states.values()); // [Wisconsin, California]

        //Retrieve all the entries as a Set using entrySet() method
        System.out.println(states.entrySet()); // [WI=Wisconsin, CA=California]

        //Retrieve and print each entry using for-each loop
        System.out.println("\n-------------------------------------\n");
        for(Map.Entry<String, String> entry: states.entrySet()){
            System.out.println(entry); // prints the entry as key-value pair
            System.out.println(entry.getKey()); // prints the key only
            System.out.println(entry.getValue()); // prints the value only
        }

        //Retrieve and print each entry using forEach() method
        System.out.println("\n-------------------------------------\n");
        states.forEach((key, value) ->{
            System.out.println("Key is = " + key + " and the Value is = " + value + ".");
        });

        //Delete all key-value pairs using clear() method
        System.out.println("\n-------------------------------------\n");
        states.clear();
        System.out.println(states.isEmpty()); // true -> proves the HashMap is empty after clearing
    }
}
