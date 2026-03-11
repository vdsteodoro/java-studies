package com.github.vdsteodoro.collection.test;

import com.github.vdsteodoro.collection.domain.Customer;
import com.github.vdsteodoro.collection.domain.Whisky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Arthur Morgan");
        Customer customer2 = new Customer("Beau Bennet");

        Whisky whisky1 = new Whisky("Jameson", 8);
        Whisky whisky2 = new Whisky("Singleton", 12);
        Whisky whisky3 = new Whisky("Glenlivet", 12);

        Map<Customer, Whisky> customerWhisky = new HashMap<>();
        customerWhisky.put(customer2, whisky1);
        customerWhisky.put(customer1, whisky3);

        for (Map.Entry<Customer, Whisky> customerWhiskyEntry : customerWhisky.entrySet()){
            System.out.println(customerWhiskyEntry.getKey().getName() + " - " + customerWhiskyEntry.getValue().getName());
        }

        Map<Customer, List<Whisky>> customerWhisky2 = new HashMap<>();

        List<Whisky> customerWhiskyList1 = new ArrayList<>(List.of(whisky2, whisky3));
        List<Whisky> customerWhiskyList2 = new ArrayList<>(List.of(whisky1, whisky2));

        customerWhisky2.put(customer1, customerWhiskyList1);
        customerWhisky2.put(customer2, customerWhiskyList2);

        for (Map.Entry<Customer, List<Whisky>> listEntry : customerWhisky2.entrySet()){
            System.out.println(listEntry.getKey().getName() + "\n" + listEntry.getValue());
        }


    }
}
