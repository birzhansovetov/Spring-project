package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    @Primary
    public Animal animal() {
        Animal animal = new Animal();
        animal.setName("Bear");
        return animal;
    }
    @Bean
    public Animal animal2() {
        Animal animal = new Animal();
        animal.setName("Monkey");
        return animal;
    }
    @Bean
    public Animal animal3() {
        Animal animal = new Animal();
        animal.setName("Snake");
        return animal;
    }
    @Bean
    public Zoo zoo(Animal animal) {
        Zoo zoo = new Zoo(animal);
        zoo.showAnimal();
        return zoo;
    }
}
