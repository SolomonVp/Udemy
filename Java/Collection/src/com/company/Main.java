package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Collection - интерфейс, Collections - это класс, с методами, которые часто нужны.
        // ArrayList - это массив который может изменять свою длину.
        // В основе лежит массив Object.
        // Сначала выполняется создание 10 ячеек памяти, если надо больше, то все 10 элементов копируются переносятся в другое место и добавляется 5 ячеек.

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Victor");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        // создали массив на 200 ячеек сразу. Но size будет равен количеству элементов.
        List<String> arrayList2 = new ArrayList<>(200);

        // Это новый объект, он не ссылается на arrayList1
        List<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
    }
}
