package com.company;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Privet,      moy        drug!    Kak      idet  izuchenie               Java          ?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");                              // заменяет Java на SQL
//        s1 = s1.replaceAll(" {2,}", " ");                            // заменяет пробелы больше двух на 1 пробел
//        s1 = s1.replaceAll("\\bi\\w+", "4444");                      // заменяет слова начинающиеся на i, вставляя вместо них "4444
//        s1 = s1.replaceFirst("\\bi\\w+", "4444");                    // заменяет слова начинающиеся на i, вставляя вместо них "4444" (только для first-слова)
        System.out.println(s1);
    }
}
