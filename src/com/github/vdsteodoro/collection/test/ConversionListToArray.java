package com.github.vdsteodoro.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionListToArray {
    public static void main(String[] args) {

        List<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);

        Integer[] listToArray = numbersArrayList.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------------------------------------");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 4;
        numbersArray[1] = 5;
        numbersArray[2] = 6;

        // usando o .asList, quando alteramos um valor do list, alteramos do array tambem
        List<Integer> arrayToList = Arrays.asList(numbersArray);
        arrayToList.set(0, 100);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arrayToList);

        System.out.println("----------------------------------------");

        // uma opcao seria criar uma nova instancia recebendo a list, assim qualquer alteracao ocorreria apenas nela

        List<Integer> numbersArrayList2 = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println(numbersArrayList2);
        numbersArrayList2.add(15);
        System.out.println(numbersArrayList2);

    }
}
