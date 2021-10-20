package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {


        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(5.14);
        list1.add(4.14);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("<");
        list2.add("C");
        showListInfo(list2);
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

}
