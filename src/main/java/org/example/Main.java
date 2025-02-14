package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Zoo zoo = (Zoo) context.getBean(Zoo.class);
        Animal animal = (Animal) context.getBean(Animal.class);
        System.out.println(animal.getName());
    }
}