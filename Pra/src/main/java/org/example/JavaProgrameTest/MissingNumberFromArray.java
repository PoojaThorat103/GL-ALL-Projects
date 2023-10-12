package org.example.JavaProgrameTest;

public class MissingNumberFromArray {

    public static void main(String []args){

        int [] a= {1,2,3,4,6,};
        int ExpectedElementNo = a.length +1; //6
        int ExpectedSum = ExpectedElementNo * (ExpectedElementNo +1)/2; // --6*7/2 ---42/2 --= 21

        int sum =0;
        for(int i=0; i< a.length;i++){
            sum = sum + a[i]; // 1+2+3+4+6, = 16
        }

        int missingNumber = ExpectedSum - sum;
        System.out.println("Missing Number : " + missingNumber);




    }



}
