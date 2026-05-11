package com.github.vdsteodoro.optional.domain;

import java.util.List;
import java.util.Optional;

public class Gym {
    private Integer id;
    private String name;

    public Gym(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
