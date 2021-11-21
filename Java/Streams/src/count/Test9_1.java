package count;

import java.util.stream.Stream;

public class Test9_1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(7,1,2,3,4,5,3,2,1);

        // стрим нельзя использовать после изменения, поэтому для дистинкт.коунт закомментировал строчку с простым коунт.
//        System.out.println(stream.count());


        System.out.println(stream.distinct().count());
    }
}
