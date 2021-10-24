package com.company.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Maria");
        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
    }
}
