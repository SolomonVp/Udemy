package com.company.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println("Введенное число: " + i);

//        System.out.println("Напишите 2 числа...");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x/y);
//        System.out.println("Остаток = " + x%y);

        System.out.println("Напишите пару слов...");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Вы написали: " + s1 + " " + s2);
    }
}
