package org.example.logical;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static void main(String[] args){

        String s = "Pooja";
        char[] charArray  = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : charArray){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " : "+m.getValue());
        }

    }

}
