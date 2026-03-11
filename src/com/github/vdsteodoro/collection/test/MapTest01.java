package com.github.vdsteodoro.collection.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Car","Carro");
        map.put("Blue","Azul");
        map.put("Sky","Céu");
        map.put("Love","Amor");

        System.out.println(map);

        System.out.println("------------------------");

        for (String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
