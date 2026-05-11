package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Category;
import com.github.vdsteodoro.streams.domain.Promotion;
import com.github.vdsteodoro.streams.domain.Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.github.vdsteodoro.streams.domain.Promotion.NORMAL_PRICE;
import static com.github.vdsteodoro.streams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest11 {
    public static void main(String[] args) {
        List<Streaming> streamings = new ArrayList<>(List.of(
                new Streaming("Netflix", 37.90, Category.FILMESERIE),
                new Streaming("Premiere", 24.90, Category.ESPORTES),
                new Streaming("Hbo max", 44.90, Category.FILMESERIE),
                new Streaming("Disney plus", 27.99, Category.DESENHOS),
                new Streaming("Paramout", 34.90, Category.FILMESERIE),
                new Streaming("crunchyroll", 29.90, Category.ANIME)
        ));

        Map<Promotion, List<Streaming>> collect = streamings
                .stream()
                .collect(groupingBy(ln -> ln.getSubscriptionPrice() < 30 ? UNDER_PROMOTION : NORMAL_PRICE
                ));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<Streaming>>>

        Map<Category, Map<Promotion, List<Streaming>>> collect1 = streamings
                .stream()
                .collect(groupingBy(Streaming::getCategory, groupingBy(ln -> ln.getSubscriptionPrice() < 30 ? UNDER_PROMOTION : NORMAL_PRICE
                )));
        System.out.println(collect1);

    }
}
