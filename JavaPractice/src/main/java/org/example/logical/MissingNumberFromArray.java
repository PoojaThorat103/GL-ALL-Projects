package org.example.logical;

public class MissingNumberFromArray {

public static void main(String[] args){
    int[] arr={1, 2, 4,5,6};

    int n=arr.length+1;
    int sum=n*(n+1)/2;

    int restSum=0;
    for (int i = 0; i < arr.length; i++) {
        restSum = restSum + arr[i];
    }
    int missingNumber=sum-restSum;

    System.out.println(missingNumber);
}
}
