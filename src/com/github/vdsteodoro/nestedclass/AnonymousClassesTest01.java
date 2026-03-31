package com.github.vdsteodoro.nestedclass;

class Animal{
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void walk(){
        System.out.println("Walking...");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal horse = new Animal("pé de pano"){
            @Override
            public void walk() {
                System.out.println("horse walking...");
            }
        };

        horse.walk();
    }
}
