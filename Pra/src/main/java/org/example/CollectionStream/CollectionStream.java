package org.example.CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CollectionStream {

    public static void main (String [] args){
        // Filter use to filer data

       /* URL : https://www.geeksforgeeks.org/stream-in-java/
        https://stackify.com/streams-guide-java-8/*/

        List<Integer> numberList = Arrays.asList(10,77,30,40,5,3);

        Predicate<Integer> p = n -> n%2==0;
       // Predicate<Integer> p = n -> n%2==0;
        numberList.stream().filter(p).forEach(n->System.out.println(n));

        // or
        numberList.stream().filter(n -> n%2==0).forEach(n->System.out.println(n));

        System.out.println("------------------");
        numberList.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));

    }
}
