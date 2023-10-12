package org.example.CollectionStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionStream {
    public static void main(String[] args){
        List<Integer> al = Arrays.asList(12, 1, 45, 6, 8);

        Predicate<Integer> p = k -> {return k%3 == 0;};
        
        al.stream().filter(p).map(n -> n*2).sorted().forEach(n -> System.out.println(n));
        System.out.println("--------------------------------");

        List<Integer> al1 = al.stream().filter(n -> n%2 == 0).map(n -> n*2).sorted().collect(Collectors.toList());
        System.out.println(al1);

        System.out.println("--------------------------------");

        //Stream with Array
        Integer[] integ = new Integer[] {1,2,3,4,5};

        List<Integer> all = Arrays.stream(integ).filter(n -> n%2 == 0).map(n -> n*2).sorted().collect(Collectors.toList());
        System.out.println(all);


    }
}
