package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.List;

public class StreamTest02 {
    public static void main(String[] args) {
        List<Streaming> streamings = new ArrayList<>(List.of(
                new Streaming("Netflix", 37.90),
                new Streaming("Prime video", 24.90),
                new Streaming("Hbo max", 44.90),
                new Streaming("Disney plus", 27.99),
                new Streaming("Paramout", 34.90),
                new Streaming("Paramout", 34.90),
                new Streaming("Apple tv", 29.90)));

//        streamings.stream().forEach(System.out::println); ***NÁO É UMA BOA PRÁTICA***
//        streamings.forEach(System.out::println);

        long count = streamings
                .stream()
                .filter(stms -> stms.getSubscriptionPrice() <= 35.00)
                .count();

        long count1 = streamings
                .stream()
                .distinct()
                .filter(stms -> stms.getSubscriptionPrice() <= 35.00)
                .count();

        System.out.println(count);
        System.out.println(count1);

    }
}
