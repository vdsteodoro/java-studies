package com.github.vdsteodoro.nestedclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(new Animal("dog"), new Animal("cat")));

        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
