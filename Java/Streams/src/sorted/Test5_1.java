package sorted;

import java.util.Arrays;

public class Test5_1 {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
