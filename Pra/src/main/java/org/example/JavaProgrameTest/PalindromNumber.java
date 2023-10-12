package org.example.JavaProgrameTest;

public class PalindromNumber {

    public static void  main (String [] args){
        int num = 2345;
        int rev = 0;
        int orignalNo = num;

        while(num != 0){
            int rem = num % 10;
             rev =rev * 10+ rem;
            num = num / 10;
        }

        System.out.println(orignalNo);
        System.out.println(rev);

        if (orignalNo == rev){
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is Not Palindrom");
        }


    }



}
