package com.github.vdsteodoro.collection.test;

import com.github.vdsteodoro.collection.domain.Gpu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<Gpu> gpus = new ArrayList<>();

        gpus.add(new Gpu(37, "rtx 1050ti"));
        gpus.add(new Gpu(61, "rx rx580"));
        gpus.add(new Gpu(40, "rtx 2060s"));
        gpus.add(new Gpu(0, "rx 9060xt"));
        gpus.add(new Gpu(15, "rtx 5060ti"));


        Iterator<Gpu> gpusIterator = gpus.iterator();
        while(gpusIterator.hasNext()){
            if (gpusIterator.next().getId() == 0){
                gpusIterator.remove();
            }
        }

        System.out.println(gpus);

    }
}
