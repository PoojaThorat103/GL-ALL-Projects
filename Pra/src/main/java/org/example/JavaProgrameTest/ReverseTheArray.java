package org.example.JavaProgrameTest;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String [] args){

        int [] a= {1,2,3,4,5,6,};

      /*  for(int i=5;i>=0;i--){
            System.out.println(a[i]);
        }*/

        int i=0; int j =a.length-1;

        while(j>i){
            int tem = a[i];
            a[i] = a[j];
            a[j] = tem;

            i++;
            j--;

}
        System.out.println(Arrays.toString(a));

    }






    }


