package com.company.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_1 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<>();      System.out.println(" ");
        arrayList1.add("Victor");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(1, "Stanislav");
        System.out.println(arrayList1);                        System.out.println(" ");

        for (String s : arrayList1) {
            System.out.println(s + " ");
        }                                                      System.out.println(" ");

        System.out.println(arrayList1.get(2));

        // set заменяет элемент по индексу, без сдвига.
        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);

        // При удалении элементы смещаются. Простое remove действует только на примитивные типы данных.
        // Чтобы удалить объект - необходимо переопределить метод equals (через ALT-Insert) как в примере ArrayListMethods2,
        // без переопределения equals() ОБЬЪЕКТ НЕ УДАЛИТСЯ!
        arrayList1.remove(0);

    }
}
