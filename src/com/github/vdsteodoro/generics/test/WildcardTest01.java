package com.github.vdsteodoro.generics.test;

import com.github.vdsteodoro.generics.domain.animal.Animal;
import com.github.vdsteodoro.generics.domain.animal.Cat;
import com.github.vdsteodoro.generics.domain.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest01 {
    public static void main(String[] args) {

        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printDescription(dogs);
        printDescription(cats);

        List<Animal> animalsList = new ArrayList<>();

        animalAdd(animalsList);

        for (Animal animal : animalsList){
            System.out.println(animal);
        }

    }

    private static void printDescription(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.description();
        }
    }

    private static void animalAdd(List<? super Animal> animals){
        animals.add(new Cat("Nina cat"));
        animals.add(new Dog("Nino dog"));
        }
    }
