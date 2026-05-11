package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Introduction {
    public static void main(String[] args) {
        List<Streaming> streamings = new ArrayList<>(List.of(
                new Streaming("Netflix", 37.90),
                new Streaming("Prime video", 24.90),
                new Streaming("Hbo max", 44.90),
                new Streaming("Disney plus", 27.99),
                new Streaming("Paramout", 34.90),
                new Streaming("Apple tv", 29.90)
        ));

        streamings.sort(Comparator.comparing(Streaming::getName));

        List<String> names = new ArrayList<>();

        for (Streaming streaming : streamings) {
            if (streaming.getSubscriptionPrice() <= 35) {
                names.add(streaming.getName());
                if (names.size() == 3) {
                    break;
                }
            }
        }

        System.out.println(names);


    }
}
