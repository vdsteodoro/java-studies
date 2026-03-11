package com.github.vdsteodoro.collection.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private String name;
    private long id;

    public Customer(String name) {
        this.name = name;
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getName() {
        return name;
    }
}
