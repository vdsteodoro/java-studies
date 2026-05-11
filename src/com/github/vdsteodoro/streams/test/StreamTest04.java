package com.github.vdsteodoro.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest04 {
    public static void main(String[] args) {
        List<String> words = List.of("Kanye west", "Ye", "Flashlights");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream().map(s -> s.split("")) //Stream<String[]>
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters2);

    }
}
