package com.github.vdsteodoro.streams.test;

import com.github.vdsteodoro.streams.domain.Category;
import com.github.vdsteodoro.streams.domain.Streaming;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest10 {
    public static void main(String[] args) {
        List<Streaming> streamings = new ArrayList<>(List.of(
                new Streaming("Netflix", 37.90, Category.FILMESERIE),
                new Streaming("Premiere", 24.90, Category.ESPORTES),
                new Streaming("Hbo max", 44.90, Category.FILMESERIE),
                new Streaming("Disney plus", 27.99, Category.DESENHOS),
                new Streaming("Paramout", 34.90, Category.FILMESERIE),
                new Streaming("crunchyroll", 29.90, Category.ANIME)
        ));

        /*Map<Category, List<Streaming>> categoryListMapStreaming = new HashMap<>();

        List<Streaming> filmeserie = new ArrayList<>();
        List<Streaming> esportes = new ArrayList<>();
        List<Streaming> anime = new ArrayList<>();
        List<Streaming> desenhos = new ArrayList<>();

        for (Streaming s : streamings) {
            switch (s.getCategory()){
                case FILMESERIE -> filmeserie.add(s);
                case ESPORTES -> esportes.add(s);
                case ANIME -> anime.add(s);
                case DESENHOS -> desenhos.add(s);
            }
        }

        categoryListMapStreaming.put(Category.FILMESERIE, filmeserie);
        categoryListMapStreaming.put(Category.ESPORTES, esportes);
        categoryListMapStreaming.put(Category.ANIME, anime);
        categoryListMapStreaming.put(Category.DESENHOS, desenhos);

        System.out.println(categoryListMapStreaming);*/

        Map<Category, List<Streaming>> collect = streamings
                .stream()
                .collect(Collectors.groupingBy(Streaming::getCategory));

        System.out.println(collect);


    }
}
