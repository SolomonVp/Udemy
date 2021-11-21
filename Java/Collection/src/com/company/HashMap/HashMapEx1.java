package com.company.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur");
        map1.put(3568, "Ivan");
        map1.put(6578, "Mariya");
        map1.put(15879, "Nikolay");
        map1.put(2333, "Olgaaa");
        System.out.println(map1);
        System.out.println(map1.get(1000));
    }
}
