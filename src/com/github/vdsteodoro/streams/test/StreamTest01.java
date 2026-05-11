package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {
    public static void main(String[] args) {
        List<Streaming> streamings = new ArrayList<>(List.of(
                new Streaming("Netflix", 37.90),
                new Streaming("Prime video", 24.90),
                new Streaming("Hbo max", 44.90),
                new Streaming("Disney plus", 27.99),
                new Streaming("Paramout", 34.90),
                new Streaming("Apple tv", 29.90)));

        List<String> names = streamings.stream()
                .sorted(Comparator.comparing(Streaming::getName))
                .filter(less -> less.getSubscriptionPrice() <= 35)
                .limit(3)
                .map(Streaming::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}

