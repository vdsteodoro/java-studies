package com.github.vdsteodoro.generics.domain.animal;

public abstract class Animal {
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void description(){
    }


}
