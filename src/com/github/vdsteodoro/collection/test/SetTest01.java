package com.github.vdsteodoro.collection.test;

import com.github.vdsteodoro.collection.domain.Gpu;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        // Set é uma interface que representa uma coleção de elementos únicos (não permite duplicados).

        Set<Gpu> gpus = new HashSet<>();
        // HashSet → sem ordem
        // LinkedHashSet → mantém ordem de inserção
        // TreeSet → elementos ordenados

        gpus.add(new Gpu(37, "rtx 1050ti"));
        gpus.add(new Gpu(61, "rx rx580"));
        gpus.add(new Gpu(40, "rtx 2060s"));
        gpus.add(new Gpu(0, "rx 9060xt"));
        gpus.add(new Gpu(15, "rtx 5060ti"));

        for (Gpu gpu : gpus) {
            System.out.println(gpu);
        }

    }
}
