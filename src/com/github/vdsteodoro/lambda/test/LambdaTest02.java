package com.github.vdsteodoro.lambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Pain", "Madara", "Guy");

        List<Integer> integers = map(strings, s -> s.length());
        System.out.println(integers);

        List<String> strings1 = map(strings, s -> s.toUpperCase());
        System.out.println(strings1);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

}
