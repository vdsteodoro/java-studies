package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.behavior.domain.FunkoPop;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    static List<FunkoPop> funkoPops = new ArrayList<>(List.of(
            new FunkoPop("Harry Potter", "Sirius Black", 149.60),
            new FunkoPop("The Office", "Michael Scott", 199.90),
            new FunkoPop("Friends", "Chandler", 99.00),
            new FunkoPop("Harry Potter", "Snape", 151.90),
            new FunkoPop("The Office", "Jim", 126.78),
            new FunkoPop("Friends", "Monica", 108.72)));

    public static void main(String[] args) {
        funkoPops
                .stream()
                .map(FunkoPop::getPrice)
                .filter(price -> price <= 108.72)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = funkoPops // Dessa forma evitamos o boxing e unboxing retornando um tipo primitivo
                .stream()
                .mapToDouble(FunkoPop::getPrice)
                .filter(price -> price <= 108.72)
                .sum();
        System.out.println(sum);
    }
}
