package com.github.vdsteodoro.streams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 3, 8, 18, 4, 70);

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println );
        System.out.println(integers.stream().reduce(0, Integer::sum));

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x,y) -> x * y));

        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, Integer::max));

    }
}
