package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        al1.add(3);
        al1.add(1);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Ivan");
        al2.add("Victor");
        al2.add("Olga");
        al2.add("Poncho");
        al2.add("Vlad");
        String a1 = GenMethod.getSecondElement(al2);
        System.out.println(a1);
    }
}

class GenMethod {
    public static <T> T getSecondElement (ArrayList<T> al) {
        return al.get(1);
    }
}


