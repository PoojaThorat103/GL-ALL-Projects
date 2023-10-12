package org.example.logical;

public class FindSmallestNumberfromArray {

    public static void main(String[] args){

        int a[] = {10, 1234, 3, 567, 4, 7, 2, 234};

        int min = a[0];

        for(int i = 0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }

        System.out.println(min);

    }

}
