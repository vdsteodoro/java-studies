package com.github.vdsteodoro.generics.services;

import java.util.List;

public class RentalService<T> {

    public void rentVehicle(List<T> t){
        System.out.println("Available vehicles:");
        System.out.println(t);
        System.out.println("Renting a vehicle...");
        System.out.println(t.get(0) + " was rented");
        t.remove(0);
        System.out.println("Available vehicles:");
        System.out.println(t);
    }
}
