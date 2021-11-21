package distinct;

import java.util.stream.Stream;

public class Test8_1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(7,1,2,3,4,5,3,2,1);
        stream.distinct().forEach(System.out::println);    // distinct выводит на экран уникальные элементы стрима
    }
}
