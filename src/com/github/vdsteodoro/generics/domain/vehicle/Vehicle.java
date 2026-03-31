package com.github.vdsteodoro.generics.domain.vehicle;

public abstract class Vehicle {
    private String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

}
