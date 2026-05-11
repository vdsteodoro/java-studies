package com.github.vdsteodoro.optional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        /*
        Optional<String> o1 = Optional.of(findName("Ross"));
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        */
        Optional<String> o4 = findName("Ross");

        System.out.println(o4);
    }

    private static Optional<String> findName(String name) {
        List<String> names = new ArrayList<>(List.of("Ross", "Rachel"));

        int num = names.indexOf(name);

        if (num != -1) {
            return Optional.of(names.get(num));
        }
        return Optional.empty();
    }
}
