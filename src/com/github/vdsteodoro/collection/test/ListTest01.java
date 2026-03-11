package com.github.vdsteodoro.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Daemon targaryen");
        list1.add("Jesse pinkman");
        list1.add("tommy shelby");
        list1.add("Michael scott");

        for(String names : list1){
            System.out.println(names);
        }

    }
}
