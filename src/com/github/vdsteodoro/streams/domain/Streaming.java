package com.github.vdsteodoro.streams.domain;

import java.util.Objects;

public class Streaming {
    private String name;
    private double subscriptionPrice;
    private Category category;

    public Streaming(String name, double subscriptionPrice) {
        this.name = name;
        this.subscriptionPrice = subscriptionPrice;
    }

    public Streaming(String name, double subscriptionPrice, Category category) {
        this.name = name;
        this.subscriptionPrice = subscriptionPrice;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Streaming{" +
                "name='" + name + '\'' +
                ", subscriptionPrice=" + subscriptionPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Streaming streaming = (Streaming) o;
        return Objects.equals(name, streaming.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
