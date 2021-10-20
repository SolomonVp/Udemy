package Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Privet", 35);
        System.out.println("Значения пары: value1 = " + pair1.getFirstValue() +
                ", value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(35, 3.5);
        System.out.println("Значения пары: value1 = " + pair2.getFirstValue() +
                ", value2 = " + pair2.getSecondValue());
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
