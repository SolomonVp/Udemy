package com.company.Default;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "боб";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> revers = list.listIterator(list.size());

        boolean isPolindrome = true;
        while (iterator.hasNext() && revers.hasPrevious()) {
            if (iterator.next() != revers.previous()) {
                isPolindrome = false;
                break;
            }
        }
        if (isPolindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
