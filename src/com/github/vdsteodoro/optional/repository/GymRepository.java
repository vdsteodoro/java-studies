package com.github.vdsteodoro.optional.repository;

import com.github.vdsteodoro.optional.domain.Gym;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GymRepository {

    public static List<Gym> gyms = List.of(new Gym(31, "Raw Athletic Club"), new Gym(28, "Ironberg"));

    public static Optional<Gym> findByName(String name){
        return findBy(g -> g.getName().equals(name));
    }

    public static Optional<Gym> findById(Integer id){
        return findBy(g -> g.getId().equals(id));
    }

    private static Optional<Gym> findBy(Predicate<Gym> predicate){
        Gym found = null;

        for (Gym gym : gyms){
            if (predicate.test(gym)){
                found = gym;
            }
        }
        return Optional.ofNullable(found);
    }
}
