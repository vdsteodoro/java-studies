package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Category;
import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest09 {
    static List<Streaming> streamings = new ArrayList<>(List.of(
            new Streaming("Netflix", 37.90, Category.FILMESERIE),
            new Streaming("Premiere", 24.90, Category.ESPORTES),
            new Streaming("Hbo max", 44.90, Category.FILMESERIE),
            new Streaming("Disney plus", 27.99, Category.DESENHOS),
            new Streaming("Paramout", 34.90, Category.FILMESERIE),
            new Streaming("crunchyroll", 29.90, Category.ANIME)
    ));

    public static void main(String[] args) {
        System.out.println(streamings.stream().count());
        System.out.println(streamings.stream().collect(Collectors.counting()));

        streamings.stream().max(Comparator.comparing(Streaming::getSubscriptionPrice)).ifPresent(System.out::println);
        streamings.stream().collect(Collectors.maxBy(Comparator.comparing(Streaming::getSubscriptionPrice)))
                .ifPresent(System.out::println);

        System.out.println(streamings.stream().mapToDouble(Streaming::getSubscriptionPrice).sum());
        System.out.println(streamings.stream().collect(Collectors.summingDouble(Streaming::getSubscriptionPrice)));

        streamings.stream().mapToDouble(Streaming::getSubscriptionPrice).average().ifPresent(System.out::println);
        System.out.println(streamings.stream().collect(Collectors.averagingDouble(Streaming::getSubscriptionPrice)));

        DoubleSummaryStatistics collect = streamings.stream()
                .collect(Collectors.summarizingDouble(Streaming::getSubscriptionPrice));
        System.out.println(collect);

        String titles = streamings.stream().map(Streaming::getName).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
