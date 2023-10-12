package org.example.logical;

public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {10, 2, 34, 4, 6, 12, 45, 50, 1};
        int temp;
        int n = arr.length;

        for(int i = 0; i< n; i++){
            for(int j = 1; j<(n-i); j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int data : arr){
            System.out.println(data);
        }

    }

}
