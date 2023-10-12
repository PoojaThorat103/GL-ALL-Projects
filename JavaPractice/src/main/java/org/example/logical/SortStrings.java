package org.example.logical;

public class SortStrings {
    public static void main(String[] args){

        String[] names = {"Sahil", "Pooja", "Namasvi"};

        String temp;

        for(int i=0; i < names.length; i++){
            for(int j =1; j<names.length; j++){
                if(names[i].compareTo(names[j]) > 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for(String name : names){
            System.out.println(name);
        }

    }
}
