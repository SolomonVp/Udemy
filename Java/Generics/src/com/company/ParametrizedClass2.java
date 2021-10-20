package com.company;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair <String, Integer> pair1 = new Pair<>("Privet", 20);
        System.out.println("Znachenie pari: value1 = " + pair1.getFirstValue() + ", value2 = " + pair1.getSecondValue());

        Pair <Integer, String> pair2 = new Pair<>(20, "Privet");
        System.out.println("Znachenie pari: value1 = " + pair2.getFirstValue() + ", value2 = " + pair2.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 v1;
    private V2 v2;

    public Pair(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getFirstValue() {
        return v1;
    }

    public V2 getSecondValue() {
        return v2;
    }
}
