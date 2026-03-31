package com.github.vdsteodoro.generics.domain.animal;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void description() {
        System.out.println("I'm a dog");
    }
}
