package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest05 {
    private static List<Streaming> streamings = new ArrayList<>(List.of(
            new Streaming("Netflix", 37.90),
            new Streaming("Prime video", 24.90),
            new Streaming("Hbo max", 44.90),
            new Streaming("Disney plus", 27.99),
            new Streaming("Paramout", 34.90),
            new Streaming("Paramout", 34.90),
            new Streaming("Apple tv", 29.90)));

    public static void main(String[] args) {

        System.out.println(streamings.stream().anyMatch(s -> s.getSubscriptionPrice() <25));
        System.out.println(streamings.stream().allMatch(s -> s.getSubscriptionPrice() <25));
        System.out.println(streamings.stream().noneMatch(s -> s.getSubscriptionPrice() <25));

        streamings
                .stream()
                .filter(v -> v.getSubscriptionPrice() <= 29.90)
                .findFirst().ifPresent(System.out::println);

        System.out.println("---------");

        streamings
                .stream()
                .filter(v -> v.getName() == "Paramout")
                .findAny().ifPresent(System.out::println);

    }
}
