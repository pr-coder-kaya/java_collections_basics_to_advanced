package _01_Arrays;

import java.util.Arrays;

public class _02_Multidimensional_Arrays {
    public static void main(String[] args) {

        /*
        A Multidimensional array is known as an array of arrays
         */

        //Declaring a two-dimensional String array - we must define outer array's size
        String[][] cities = new String[2][];

        //Declaring inner arrays' size
        cities[0] = new String[3];
        cities[1] = new String[1];

        //Getting the size of outer and inner arrays
        System.out.println(cities.length); // 2
        System.out.println(cities[0].length); // 3
        System.out.println(cities[1].length); // 1

        //Adding some values to arrays
        cities[0][0] = "Chicago";
        cities[0][1] = "Miami";
        cities[0][2] = "San Francisco";
        cities[1][0] = "Toronto";

        //Retrieving an element from the two-dimensional array using its index
        System.out.println("First element in the first inner array is = " + cities[0][0]); // Chicago
        System.out.println("First element in the second inner array is = " + cities[1][0]); // Toronto

        //Printing the two-dimensional array by converting it to String - using Arrays.deepToString() method
        System.out.println("The array is = " + Arrays.deepToString(cities)); // [[Chicago, Miami, San Francisco], [Toronto]]

        //Looping through each element in the two-dimensional array and printing them one by one using fori loop
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        //Looping through each element in the two-dimensional array and printing them one by one using enhanced for loop
        for (String[] cityArray : cities) {
            for (String city : cityArray) {
                System.out.println(city);
            }
        }

    }
}
