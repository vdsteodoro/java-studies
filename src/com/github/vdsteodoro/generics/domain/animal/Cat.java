package com.github.vdsteodoro.generics.domain.animal;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void description() {
        System.out.println("I'm a cat");
    }
}
