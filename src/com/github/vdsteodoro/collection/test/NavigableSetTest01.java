package com.github.vdsteodoro.collection.test;

import com.github.vdsteodoro.collection.domain.Gpu;
import com.github.vdsteodoro.collection.domain.Whisky;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class WhiskyNameComparator implements Comparator<Whisky> {
    @Override
    public int compare(Whisky o1, Whisky o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class GpuModelComparator implements Comparator<Gpu> {
    @Override
    public int compare(Gpu o1, Gpu o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Whisky> set = new TreeSet<>(new WhiskyNameComparator());

        set.add(new Whisky("Jameson", 8));
        set.add(new Whisky("Singleton", 12));
        set.add(new Whisky("Glenlivet", 12));

        for (Whisky whisky : set) {
            System.out.println(whisky);
        }

        System.out.println("------------------------------------------");

        NavigableSet<Gpu> gpus = new TreeSet<>(new GpuModelComparator());

        gpus.add(new Gpu(37, "rtx 1050ti"));
        gpus.add(new Gpu(61, "rx rx580"));
        gpus.add(new Gpu(40, "rtx 2060s"));
        gpus.add(new Gpu(0, "rx 9060xt"));

        for (Gpu gpus1 : gpus) {
            System.out.println(gpus1);
        }

        System.out.println("------------------------------------------");

        /*
        Some methods
        lower(e) → maior elemento menor que e
        floor(e) → maior elemento menor ou igual a e
        higher(e) → menor elemento maior que e
        ceiling(e) → menor elemento maior ou igual a e
         */

        Gpu gpuTest = new Gpu(95, "rtx 5070ti");

        System.out.println(gpus.lower(gpuTest));
        System.out.println(gpus.floor(gpuTest));
        System.out.println(gpus.higher(gpuTest));

        System.out.println(gpus.ceiling(gpuTest));

    }
}
