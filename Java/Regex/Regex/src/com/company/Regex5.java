package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myString = "21402381658650166051610;" +
                "23901482318956210561027;" +
                "23874632987146986149836;";
        // 60/51 2140 2381 6586 5016 (610)   - первые 16 цифр это код карты, потом 4 цифры это до какого числа, потом 3 цифры это пин-код карты
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll
//                ("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
























