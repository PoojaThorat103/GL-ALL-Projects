package org.example.LambdaTest;

interface C{

    int addition(int x, int y);
}



public class LambdaTwo {

    public static void main(String[] args) {

        C obj1 = (int x, int y) ->
        {
            int sum = x+10;
            System.out.println(sum);
            return sum;
        };

        obj1.addition(20, 30);


    }
}
