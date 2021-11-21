package peek;

import java.util.stream.Stream;

public class Test10_1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(7,1,2,3,4,5,3,2,1);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
