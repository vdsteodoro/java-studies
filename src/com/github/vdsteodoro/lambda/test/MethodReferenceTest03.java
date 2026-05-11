package com.github.vdsteodoro.lambda.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Joey", "Chandler", "Ross"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("24");
        System.out.println(num);

        BiPredicate<List<String>, String> checkname = List::contains;

        System.out.println(checkname.test(list, "Joey"));

    }
}
