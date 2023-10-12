package org.example.logical;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 578;
        int orignalNo = num;

        int amsNo = 0;

        while(num != 0){
            int reminder = num % 10;
            amsNo = amsNo + reminder * reminder * reminder;
            num = num / 10;
        }

        if(orignalNo == amsNo){
            System.out.println(orignalNo +" : is a armstrong number");
        }else{
            System.out.println(orignalNo +" : is not a armstrong number");
        }
    }
}
