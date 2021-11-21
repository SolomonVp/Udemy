package map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1_1_map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet!");
        list.add("Kak dela?");
        list.add("Ok!");
        list.add("Poka!");

        // Без Стрима
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

        // .stream() означает что мы взяли из коллекции все значения
        // .map() означает "к каждому елементу нашего стрима" будет применен процесс в скобочках. В данном примере - каждый элемент стрима получит длину.
        // .map() не меняет саму коллекцию, которую мы вызвали. Все измененные данные можно поместить в новую коллекцию.
        // .collect(Collectors.toList()) - преобразовал наш потом в лист

        List<Integer> list2 = list.stream().map(element -> element.length())
                        .collect(Collectors.toList());
        System.out.println(list2);
    }
}
