package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary: ");
        System.out.println("____________________________________________________________________________________________");
    }
    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и МирЪ";
    }
    public void getMagazine() {
        System.out.println("Мы береж журнал из UniLibrary");
        System.out.println("____________________________________________________________________________________________");
    }
    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("____________________________________________________________________________________________");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary: ");
        System.out.println("____________________________________________________________________________________________");
    }
    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary: ");
        System.out.println("____________________________________________________________________________________________");
    }
}
