package com.github.vdsteodoro.optional.test;

import com.github.vdsteodoro.optional.domain.Gym;
import com.github.vdsteodoro.optional.repository.GymRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Gym> gymByName = GymRepository.findByName("Ironberg");

        gymByName.ifPresent(g -> g.setName(g.getName() + " 2"));
        System.out.println(gymByName);
        System.out.println("------------------");

        Gym gymById = GymRepository.findById(31).orElseThrow(IllegalArgumentException::new);
        System.out.println(gymById);
        System.out.println("------------------");


        Gym gymNew = GymRepository.findByName("Area 51")
                .orElse(new Gym(94, "Area 51"));

        System.out.println(gymNew);
        System.out.println("------------------");



    }
}
