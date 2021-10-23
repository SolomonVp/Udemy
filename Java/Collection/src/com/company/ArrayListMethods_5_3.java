package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods_5_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("ArrayList = " + arrayList1);
        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("SubList = " + myList);
        myList.add("Fefor");
        System.out.println("SubList = " + myList);
        System.out.println("ArrayList = " + arrayList1);
        arrayList1.add("Sveta");
        System.out.println("ArrayList = " + arrayList1);
        System.out.println("SubList = " + myList);

    }
}
