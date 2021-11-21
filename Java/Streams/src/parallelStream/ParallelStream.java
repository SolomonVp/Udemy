package parallelStream;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, ..., 1000000000
        // 1 - 25000000
        // 25000001 - 50000000
        // 50000001 - 75000000
        // 75000001 - 100000000
        // позволяет перемножить от 1 до 100000000000 на разных ядрах процессора, чтоы увеличивает скорость.

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        // Сделать стрим паралленльным можно двумя способами.
        // Первый это когда мы получаем стрим из Листа.
        // Или когда создаем стрим с нуля - выполняем метод параллель.

        double sumResult = list.parallelStream()                                       // Java сама решает на сколько потоков поелить стрим
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("sumResult = " + sumResult);

        double divisionResult = list.parallelStream()                                       // При делении результат с использованием параллельстрима будет некорректный
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("sumResult = " + divisionResult);
    }
}
