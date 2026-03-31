package com.github.vdsteodoro.generics.test;

import com.github.vdsteodoro.generics.domain.vehicle.Car;
import com.github.vdsteodoro.generics.services.RentalService;

import java.util.ArrayList;
import java.util.List;

public class genericClassTest01 {
    public static void main(String[] args){
        List<Car> cars = new ArrayList<>(List.of(new Car("Gtr r35"), new Car("Silvia s14"), new Car
                ("Ferrari F40")));

        RentalService rs = new RentalService();

        rs.rentVehicle(cars);

    }
}
