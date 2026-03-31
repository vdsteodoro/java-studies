package com.github.vdsteodoro.behavior.domain;

import java.util.ArrayList;
import java.util.List;

public class FunkoPop {
    private String franchise = "Bmw";
    private String character;
    private double price;

    public FunkoPop(String franchise, String character, double price) {
        this.franchise = franchise;
        this.character = character;
        this.price = price;
    }



    @Override
    public String toString() {
        return "FunkoPop{" +
                "franchise='" + franchise + '\'' +
                ", character='" + character + '\'' +
                ", price=" + price +
                '}';
    }



    public String getFranchise() {
        return franchise;
    }

    public String getCharacter() {
        return character;
    }

    public double getPrice() {
        return price;
    }
}
