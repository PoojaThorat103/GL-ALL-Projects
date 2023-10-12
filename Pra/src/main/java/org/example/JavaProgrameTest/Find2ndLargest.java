package org.example.JavaProgrameTest;

public class Find2ndLargest {

/* Note : Same code as decending only in last need to print 2nd heighest value like
    System.out.println(a[1]);*/
    public static void main(String[] args) {
        int[] a = {80, 20, 40, 90, 10};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }
}
