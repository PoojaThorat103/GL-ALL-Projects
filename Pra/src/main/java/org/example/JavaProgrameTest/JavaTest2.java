package org.example.JavaProgrameTest;

public class JavaTest2 {

    // 2. Passing Array to a Method in Java --------------------------------------------------
    static void printMinValue(int arrValue[]){

        int min = arrValue[0];
        for(int i=1; i<arrValue.length; i++){
            if(min > arrValue[i]){
                min = arrValue[i];
            }
        }
        System.out.println(min);

    }

    public static void main (String [] args){
        int  []a  ={8,4,6,8,9,1};
        printMinValue(a);
    }

}
