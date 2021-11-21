package com.company.Stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Zaur");
        stringStack.push("Misha");
        stringStack.push("Oleg");
        stringStack.push("Katya");

        System.out.println(stringStack);
        System.out.println(stringStack.peek());
        System.out.println(stringStack);


//        while (!stringStack.isEmpty()) {
//            System.out.println(stringStack.pop());
//            System.out.println(stringStack);
//        }
    }
}
