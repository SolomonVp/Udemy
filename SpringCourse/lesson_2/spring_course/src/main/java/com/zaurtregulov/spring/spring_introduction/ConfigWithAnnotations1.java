package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("cat", Cat.class); // Тут id бина было создано Спрингом автоматически (Имени класса было автоматически присвоенно то же имя, только с маленькой буквы)
        myCat.say();
        context.close();
    }
}
