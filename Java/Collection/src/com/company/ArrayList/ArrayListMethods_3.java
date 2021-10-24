package com.company.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();      System.out.println(" ");
        arrayList1.add("Victor");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Ivan");

        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();      System.out.println(" ");
//        arrayList2.add("Oleg");
//        arrayList2.add("Dima");
//        arrayList2.add("Serj");
//
//        arrayList1.addAll(1, arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();



        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Ivan"));
        System.out.println(arrayList1);
        System.out.println(arrayList1.toString());
    }
}
