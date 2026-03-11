package com.github.vdsteodoro.collection.domain;

import java.util.Objects;

public class Gpu {
    private int id;
    private String model;

    public Gpu() {
    }

    public Gpu(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gpu gpu = (Gpu) o;
        return Objects.equals(id, gpu.id) && Objects.equals(model, gpu.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model);
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
