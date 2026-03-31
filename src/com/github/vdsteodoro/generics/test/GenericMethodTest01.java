package com.github.vdsteodoro.generics.test;

import com.github.vdsteodoro.generics.domain.animal.Animal;
import com.github.vdsteodoro.generics.domain.animal.Cat;
import com.github.vdsteodoro.generics.domain.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        Animal animal = new Cat("Nina");
        Animal animal2 = new Dog("Nino");

        createListWithAnObj(animal,animal2);
    }

    private static <T> void createListWithAnObj(T... t){
        List<T> tList = new ArrayList<>(List.of(t));
        System.out.println("Obj add: ");
        for (T tl : tList){
            System.out.println(tl);
        }
    }
}
