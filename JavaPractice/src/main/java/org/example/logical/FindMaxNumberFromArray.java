package org.example.logical;

public class FindMaxNumberFromArray {

    public static void main(String[] args){

        int[] a = {10, 45, 552, 133, 4444, 68};

        int max = a[0];

        for(int i = 0; a.length>i; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println(max);

    }

}
