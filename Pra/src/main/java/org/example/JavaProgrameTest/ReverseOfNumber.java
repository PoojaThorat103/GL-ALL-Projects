package org.example.JavaProgrameTest;

public class ReverseOfNumber {

    // Logic is  need to
    /*find reminder
    take one rev variable and use formula : rev *10 + reminder
    and need to devide quotient by 10*/


    public static void main (String [] args){

        int num = 12345;
        int rev =0;

       while(num != 0) {
            int rem = num % 10;
             rev = rev * 10 + rem;
            num = num / 10;
    }
        System.out.println(rev);
    }




}
