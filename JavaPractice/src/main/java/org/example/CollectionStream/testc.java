package org.example.CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class testc {
    public static void main(String[] args){
        List<Integer> al = Arrays.asList(12, 2, 5,1, 23, 43,10, 6);
        al.forEach(n -> System.out.println(n));

       // Consumer<Integer> c = n -> System.out.println(n);

        /*Consumer c1 = new Consumer<Integer>(){
            public void accept(Integer a){
            System.out.println(a);
          }
        };*/

        /*al.forEach(n -> System.out.println(n));
        System.out.println("---------------------------------");

        Predicate<Integer> p = n -> n%2==0;

        List<Integer> al1 = al.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());

        al1.forEach(n -> System.out.println(n));*/

        System.out.println("---------------------------------");

        /*Stream<Integer> s1 = al.stream().sorted();
        Stream<Integer> s2 =s1.filter(j->j%2==0);
        s2.count();*/
        System.out.println("---------------------------------");

        al.stream().filter(n->n%2==0).map(n->n*2).sorted().forEach(n->System.out.println(n));

    }
}
