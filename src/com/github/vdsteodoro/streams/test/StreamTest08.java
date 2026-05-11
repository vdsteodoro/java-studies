package com.github.vdsteodoro.streams.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.StreamSupport.intStream;

public class StreamTest08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).filter(r -> r % 2 == 0).forEach(System.out::println);
        System.out.println("----------------");
        IntStream.range(1, 10).filter(r -> r % 2 == 0).forEach(System.out::println);

        Stream.of("That's", "what", "she", "said")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
    }
}
