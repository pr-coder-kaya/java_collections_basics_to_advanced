package _01_Arrays;

import java.util.Arrays;

public class _03_Declaring_Initializing_Arrays {
    public static void main(String[] args) {

        String[] names; // Declaring an array
        names = new String[5]; // Initialization of the array

        //Declaring and initializing an array
        String[] countries = new String[3];

        //Declaring and initializing an array with initial values
        int[] numbers = {3, 5, 7};
        String[] colors = {"Green", "Red", "Yellow"};

        //Printing all arrays above
        System.out.println("names array is = " + Arrays.toString(names)); // [null, null, null, null, null]
        System.out.println("countries array is = " + Arrays.toString(countries)); // [null, null, null]
        System.out.println("colors array is = " + Arrays.toString(colors)); // [Green, Red, Yellow]
    }
}
