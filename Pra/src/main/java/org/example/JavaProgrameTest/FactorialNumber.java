package org.example.JavaProgrameTest;

public class FactorialNumber {

    public static void main (String[] args){
        int f =1;
        int count = 4;

        for(int i=1; i<=count;i++){ // 1*2*3*4,
            f= f*i;
        }

        System.out.println(f);
    }


}
