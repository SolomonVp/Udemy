package com.company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Привет");
        al.add("Пока");
        al.add("Окей");
        al.add("Учим Java");
        al.add("А именно Lambdas");
//        al.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;

        al.removeIf(p);
        System.out.println(al);

    }
}
