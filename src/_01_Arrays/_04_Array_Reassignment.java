package _01_Arrays;

import java.util.Arrays;

public class _04_Array_Reassignment {
    public static void main(String[] args) {

        //Declaring and initializing an array with initial values
        String[] arr1 = {"Java", "JavaScript"};

        //Declaring a new array an assigning another array to it
        String[] arr2 = arr1;

        //Reassigning new object values to arrays
        arr1[0] = "C#";
        arr2[1] = "C++";

        //Printing out the arrays
        System.out.println(Arrays.toString(arr1)); // [C#, C++]
        System.out.println(Arrays.toString(arr2)); // [C#, C++]


        //Declaring and initializing arrays with initial values
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {10, 11};
        numbers1 = numbers2;

        //Printing out the arrays
        System.out.println(Arrays.toString(numbers1)); // [10, 11]
        System.out.println(Arrays.toString(numbers2)); // [10, 11]

    }
}
