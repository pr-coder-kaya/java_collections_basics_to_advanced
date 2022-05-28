package _03_Cursors_Iterating_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class _02_Iterator {
    public static void main(String[] args) {
        /*
        Iterator is a universal cursor that can be applied to any collection object.
        So, let's create an ArrayList collection object and see how to iterate it using Iterator.
         */

        //Creating an ArrayList
        ArrayList<String> al = new ArrayList<>();

        //Adding objects to ArrayList using add(object) method
        al.add("John");
        al.add("Max");
        al.add("Leo");
        al.add("Jane");
        al.add("Leo");

        //Printing the ArrayList
        System.out.println(al); // [John, Max, Leo, Jane, Leo]

        //Creating Iterator using iterator() method
        Iterator<String> it = al.iterator();

        //Retrieving or reading each element in the ArrayList and removing object that are "Leo" using Iterator methods with while loop
        while(it.hasNext()){
            String object = it.next();
            System.out.println(object);
            if(object.equals("Leo")) it.remove(); // This line remove "Leo" objects from the original ArrayList
        }
        /*
        EXPECTED OUTPUT:
        John
        Max
        Leo
        Jane
        Leo
         */

        //Printing the ArrayList
        System.out.println(al); // [John, Max, Jane]
    }
}
