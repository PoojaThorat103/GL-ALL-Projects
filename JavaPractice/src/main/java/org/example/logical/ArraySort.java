package org.example.logical;

public class ArraySort {

    public static void main(String[] args){

        int a[] = {10 ,4, 12, 56, 7, 234, 9, 33};
        int temp;

        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int data : a){
            System.out.println(data);
        }

    }

}
