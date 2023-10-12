package org.example.logical;

public class NumberPalindrome {

    public static void main(String[] args){

        int num = 131;
        int rev = 0;
        int orignalNo = num;

        while(num != 0){
            int reminder = num % 10;
            rev = rev * 10 +reminder;
            num = num / 10;
        }
        System.out.println("Orignal number : "+orignalNo);
        System.out.println("Reverse Number : "+rev);

        if(orignalNo == rev){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }

}
