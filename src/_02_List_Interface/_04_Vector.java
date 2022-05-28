package _02_List_Interface;

import java.util.Vector;

public class _04_Vector {
    public static void main(String[] args) {

        //Creating a Vector
        Vector<String> vector = new Vector<>(50, 5);

        //Adding objects to Vector using add(object) method
        vector.add("John");
        vector.add("Max");
        vector.add("Leo");
        vector.add("Jane");

        //Printing the Vector
        System.out.println(vector); // [John, Max, Leo]

        //Removing objects from Vector
        vector.remove("Max"); // or vector.removeElement("Max"); // This will remove "Max"
        vector.remove(0); // or vector.removeElementAt(0); // This will remove "John"

        //Printing the Vector
        System.out.println(vector); // [Leo, Jane]

        //Print first and last element from the Vector
        System.out.println(vector.firstElement()); // Leo
        System.out.println(vector.lastElement()); // Jane
    }
}
