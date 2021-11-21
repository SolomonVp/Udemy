package reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        // 5, 8, 2, 4, 3
        // accumulator = 5     40    80    320   960
        // element =     8     2     4     3
        // reduce - это типа итератора что-то
        int result = list.stream().reduce((accumulator, element) ->
                accumulator*element).get();
        System.out.println(result);

        // ________________________________________________________________________________
        // 5, 8, 2, 4, 3
        // accumulator = 1     5    40    80   320     960
        // element =     5     8     2     4    3
        // reduce - это типа итератора что-то
        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator*element);
        System.out.println(result2);

        // ________________________________________________________________________________

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
                accumulator*element);
        if (o.isPresent()){
            System.out.println(o.get());
        } else {
            System.out.println("Not present!");
        }
        // ________________________________________________________________________________
        Optional<Integer> o2 = list.stream().reduce((accumulator, element) ->
                accumulator*element);
        if (o2.isPresent()){
            System.out.println(o2.get());
        } else {
            System.out.println("Not present!");
        }
    }
}
