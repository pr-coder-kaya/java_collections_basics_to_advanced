package _01_Arrays;

import java.util.Arrays;

public class _01_Array_Introduction {
    public static void main(String[] args) {

        //Storing a single int value
        int number = 45;

        //Storing multiple int values - use array to store 5 int values
        int[] numbers = new int[5]; // initial size must be declared. Otherwise, compiler error will occur

        //Adding actual values using index which always starts from zero
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 3;
        numbers[3] = 9;
        numbers[4] = 1;

        //Getting the array size - use length
        System.out.println("The size of the array is = " + numbers.length);

        //Retrieving an element from the array using its index
        System.out.println("The third element is = " + numbers[2]); // 3

        //Printing the array by converting it to String - using Arrays.toString() method
        System.out.println("The array is = " + Arrays.toString(numbers)); // [5, 7, 3, 9, 1]

        //Looping through each element in the array and printing them one by one using fori loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index of " + i + " = " + numbers[i]);
        }

        //Looping through each element in the array and printing them one by one using enhanced for loop
        for (int i : numbers) {
            System.out.println("Element is = " + i);
        }

        //Sorting the array using Arrays.sort() method - it sorts in ascending order for primitives (lexicographically for object)
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 3, 5, 7, 9]
    }
}
