package com.company.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods_5_4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("ArrayList = " + arrayList1);
        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[5]);
        for (String s : array2) {
            System.out.println(s);
        }
        System.out.println(" ");
        String[] array3 = arrayList1.toArray(new String[7]);
        for (String s : array3) {
            System.out.println(s);
        }
        System.out.println(" ");
        String[] array4 = arrayList1.toArray(new String[0]);
        for (String s : array4) {
            System.out.println(s);
        }
    }
}
