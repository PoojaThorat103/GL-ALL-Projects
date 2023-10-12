package org.example.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayNumbers {

    public static void main(String[] args){

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(42);
        a.add(3);

        List<Integer> reverseNumber = ConvertArrayNumbers.reverseArray(a);

        System.out.println(reverseNumber);
    }

    //To reverse an array without using another array we are using for loop which loops till middle index of given array and then swap first number with the last number, swap second number with second last number until middle of the given array. Here’s the java program.
    public static List<Integer> reverseArray(List<Integer> a) {
        Integer[] arrInput = a.stream().toArray(Integer[]::new);

      //  Collections.reverse(Arrays.asList(b));

        if(arrInput == null || arrInput.length <= 1)
        {
            System.out.println("Please enter valid array");
        }
        for(int i = 0; i < arrInput.length / 2; i++)
        {
            int temp = arrInput[i];
            arrInput[i] = arrInput[arrInput.length - 1 - i];
            arrInput[arrInput.length - 1 - i] = temp;
        }

        List<Integer> k = Arrays.asList(arrInput);
        return k;

    }
}
