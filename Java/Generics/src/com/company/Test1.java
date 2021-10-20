package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("sdfsdf");
        list.add("123dsf");


        for (String o : list) {
            System.out.println(o + " dlina " + o.length());
        }
    }
}

class Car {}
