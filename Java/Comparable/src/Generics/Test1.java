package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Ok");
        list.add(2);
        list.add(new StringBuilder("rt"));
        list.add(new Car());
    }
}

class Car{}
