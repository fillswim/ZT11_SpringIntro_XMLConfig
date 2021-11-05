package com.fillswim.spring.Introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml конфигурация applicationContext
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("appContext.xml")) {

            Pet pet = context.getBean("petBean", Pet.class);
            pet.say();
            System.out.println();

            Person person = context.getBean("personBean", Person.class);
            person.callPet();
        }
    }
}
