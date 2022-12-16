package _06_Map_Interface;

import java.util.TreeMap;

public class _03_TreeMap_Introduction {
    public static void main(String[] args) {

        //Creating a TreeMap
        TreeMap<Integer, String> members = new TreeMap<>();

        //Adding key-value pairs using put(key, value) method
        members.put(3, "Alex");
        members.put(5, "Mike");
        members.put(2, "John");

        //Printing the TreeMap
        System.out.println(members); // {2=John, 3=Alex, 5=Mike} -> proves that key-value pairs are sorted based on their keys.

        //Getting the first key using firstKey() method
        System.out.println(members.firstKey()); // 2

        //Getting the first entry using firstEntry() method
        System.out.println(members.firstEntry()); // 2=John

        //Getting the last key using lastKey() method
        System.out.println(members.lastKey()); // 5

        //Getting the last entry using lastEntry() method
        System.out.println(members.lastEntry()); // 5=Mike

        //Printing each key and value in descending order
        members.descendingMap().forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
