package org.example;

public class Zoo {
    private final Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }
    public void showAnimal() {
        System.out.println("The zoo has a : " + animal.getName());
    }
}
