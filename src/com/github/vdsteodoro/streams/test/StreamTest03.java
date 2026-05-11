package com.github.vdsteodoro.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<List<String>> team = new ArrayList<>();

        List<String> it = new ArrayList<>(List.of("Alice Johnson", "Robert Smith"));
        List<String> adminstration = new ArrayList<>(List.of("Elena Rodriguez", "Michael Chen"));
        List<String> legalDepartament = new ArrayList<>(List.of("Sarah Miller", "David Brown"));
        List<String> finance = new ArrayList<>(List.of("Sophia Wilson", "James Taylor"));

        team.add(it);
        team.add(adminstration);
        team.add(legalDepartament);
        team.add(finance);

        team.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
