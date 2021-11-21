package reduce;

import java.util.ArrayList;
import java.util.List;

public class Test4_2 {
    public static void main(String[] args) {
        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela");
        list3.add("OK");
        list3.add("poka");

        String result3 = list3.stream().reduce((a, e) ->
                a + " " + e).get();

        System.out.println(result3);

    }
}
