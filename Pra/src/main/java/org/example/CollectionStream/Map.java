package org.example.CollectionStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Map {
// MAP USE TO PERFORM CERTAIN OPERATIONS ON IT.

    public static void main (String [] args){

        List<Integer> numberList = Arrays.asList(10,77,30,40,5,3);
        List<Integer> ListAfterMultiply = new ArrayList<Integer>();

        ListAfterMultiply = numberList.stream().map(v -> v*2).collect(Collectors.toList());
        System.out.println("--------MAP : value*2 ----------");
        System.out.println(ListAfterMultiply);

        System.out.println("--------MAP : Even value + value*2 ----------");
        numberList.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));

        System.out.println("--------MAP : value*2 + sorted ----------");
        numberList.stream().map(s-> s*2).sorted().forEach(n -> System.out.println(n));

        System.out.println("--------MAP :  sorte the value----------");
        numberList.stream().sorted().forEach(n -> System.out.println(n));

    }
}
