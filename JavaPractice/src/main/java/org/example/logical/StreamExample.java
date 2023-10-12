package org.example.logical;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {


    public static void main(String[] args){
        List<String> ls = new ArrayList<>();
        ls.add("sahil");
        ls.add("pooja");

        ls.stream().sorted().forEach(System.out::println);

        List<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(2);
        ls1.add(3);
        ls1.add(4);
    }
}
