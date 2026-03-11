package com.github.vdsteodoro.collection.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Whisky {
    private long id;
    private String name;
    private int age;

    public Whisky(String name, int age) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Whisky{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Whisky whisky = (Whisky) o;
        return id == whisky.id && age == whisky.age && Objects.equals(name, whisky.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
