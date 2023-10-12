package org.example.JavaProgrameTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicateValue {

public static void main(String[]args){

    int [] a ={1,5,8,1,6,5,9,5};

    HashMap<Integer, Integer> s = new HashMap();

    for(int num : a){
        if(s.containsKey(num)){
            s.put(num, s.get(num)+1);
        }else{
            s.put(num, 1);
        }
    }

    System.out.println( "Duplicate elements are :");
    for(Map.Entry<Integer, Integer> map : s.entrySet()){
        // IT WILL SHOW HOW MANY TIMES ELEMNET ARE REPETING
       System.out.println("Key " +map.getKey() +" = "+map.getValue());
    //Ist time storing value as 1 and if value is greater than 1 means it is duplicate value.
        if(map.getValue()>1){
            System.out.println(map.getKey());
        }
    }
}
}
