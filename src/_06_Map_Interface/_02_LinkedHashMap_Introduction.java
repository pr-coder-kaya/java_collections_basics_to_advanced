package _06_Map_Interface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _02_LinkedHashMap_Introduction {
    public static void main(String[] args) {

        //Creating and adding key-value pairs to a HashMap
        HashMap<String, String> capitals1 = new HashMap<>();
        capitals1.put("France", "Paris");
        capitals1.put("Germany", "Berlin");
        capitals1.put("Italy", "Rome");
        capitals1.put("Spain", "Madrid");

        //Creating and adding key-value pairs to a LinkedHashMap
        LinkedHashMap<String, String> capitals2 = new LinkedHashMap<>();
        capitals2.put("France", "Paris");
        capitals2.put("Germany", "Berlin");
        capitals2.put("Italy", "Rome");
        capitals2.put("Spain", "Madrid");

        //Printing the HashMap and the LinkedHashMap
        System.out.println(capitals1); // {Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid} -> no insertion order
        System.out.println(capitals2); // {France=Paris, Germany=Berlin, Italy=Rome, Spain=Madrid} -> insertion order preserved
    }
}
