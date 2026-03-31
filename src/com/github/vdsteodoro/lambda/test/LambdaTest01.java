package com.github.vdsteodoro.lambda.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Saul Goodman", "Walter White", "Jesse Pinkman");

        forEach(strings, stg -> System.out.println(stg));

    }

    private static <T> void forEach(List<T> list, Consumer consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
