package _03_Cursors_Iterating_Collections;

import java.util.Enumeration;
import java.util.Vector;

public class _01_Enumeration {
    public static void main(String[] args) {
        /*
        Enumeration is a legacy interface that is applicable only for legacy classes like Vector, HashTable, Stack, etc.
        So, let's create a Vector collection object and see how to iterate it using Enumeration.
         */

        //Creating a Vector
        Vector<Integer> vector = new Vector<>();

        //Adding objects to Vector using add(object) method
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(14);

        //Printing the Vector
        System.out.println(vector); // [10, 11, 12, 13, 14]

        //Creating Enumeration using elements() method of Vector class
        Enumeration e = vector.elements();


        //Retrieving or reading each element in the Vector using Enumeration methods with while loop
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        /*
        EXPECTED OUTPUT:
        10
        11
        12
        13
        14
         */
    }
}
