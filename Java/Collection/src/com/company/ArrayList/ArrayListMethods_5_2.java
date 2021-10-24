package com.company.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_5_2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Maria");
        arrayList2.add("Igor");

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);
    }
}
