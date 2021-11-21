package concat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7_1 {
    public static void main(String[] args) {
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        stream4.forEach(System.out::print);

        System.out.println(" ");

        Stream<String> s1 = Stream.of("p", "r", "i", "v", "e", "t", ",", " ");
        Stream<String> s2 = Stream.of("l", "o", "h");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::print);

        System.out.println(" ");

        Stream<String> str1 = Stream.of("п", "р", "и", "в", "е", "т", ",", " ");
        Stream<String> str2 = Stream.of("л", "о", "х");
        Stream<String> str3 = Stream.concat(str1, str2);
        str3.forEach(System.out::print);
    }
}
