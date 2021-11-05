package com.fillswim.spring.Introduction;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
