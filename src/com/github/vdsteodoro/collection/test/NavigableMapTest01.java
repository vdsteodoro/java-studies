package com.github.vdsteodoro.collection.test;

import com.github.vdsteodoro.collection.domain.Customer;
import com.github.vdsteodoro.collection.domain.Gpu;

import java.util.*;

public class NavigableMapTest01 {
    public static void main(String[] args){
        Customer customer1 = new Customer("Yuri Alberto");
        Customer customer2 = new Customer("Memphis Depay");

        Gpu gpu1 = new Gpu(40, "rtx 2060s");
        Gpu gpu2 = new Gpu(3, "rx 9060xt");
        Gpu gpu3 = new Gpu(15, "rtx 5060ti");
        Gpu gpu4 = new Gpu(49, "intel 580");

        List<Gpu> gpuList1 = new ArrayList<>(List.of(gpu3,gpu1,gpu2));
        List<Gpu> gpuList2 = new ArrayList<>(List.of(gpu4,gpu1));

        NavigableMap<Customer, List<Gpu>> navigableMapList = new TreeMap<>(Customer::compareTo);

        navigableMapList.put(customer1, gpuList2);
        navigableMapList.put(customer2, gpuList1);

        for (Map.Entry<Customer, List<Gpu>> f : navigableMapList.entrySet()){
            System.out.println("Cliente: " + f.getKey().getName());
            for (Gpu gpu : f.getValue()){
                System.out.println(gpu);
            }
        }

    }
}
