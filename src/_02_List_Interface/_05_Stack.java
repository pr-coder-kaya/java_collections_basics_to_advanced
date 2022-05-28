package _02_List_Interface;

import java.util.Stack;

public class _05_Stack {
    public static void main(String[] args) {

        //Creating a Stack
        Stack<String> stack = new Stack<>();

        //Pushing elements to a Stack
        stack.push("John");
        stack.push("Jane");
        stack.push("Max");
        stack.push("Leo");
        stack.push("Adam");

        //Printing the Stack
        System.out.println(stack); // [John, Jane, Max, Leo, Adam]

        //Checking if stack is empty
        System.out.println(stack.empty()); // false

        //Checking if Stack has some particular objects - REMEMBER: it returns position if element exists, and -1 otherwise.
        System.out.println(stack.search("Jane")); // 4
        System.out.println(stack.search("James")); // -1

        //Accessing element from a Stack without removing - REMEMBER Last in first out
        System.out.println(stack.peek()); // Adam
        System.out.println(stack); // [John, Jane, Max, Leo, Adam]

        //Popping elements from a Stack using pop() method - it removes element from the top of the Stack
        System.out.println(stack.pop()); // Adam
        System.out.println(stack); // [John, Jane, Max, Leo]

        System.out.println(stack.pop()); // Leo
        System.out.println(stack); // [John, Jane, Max]

        //Remove all elements from the Stack
        stack.removeAllElements();
        System.out.println(stack); // []
        System.out.println(stack.size()); // 0
        System.out.println(stack.empty()); // true
    }
}
