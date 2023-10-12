package org.example.LambdaTest;
interface B{
    void display(int j);

}


public class LambdaOne {

    public static void main(String[] args) {
        B b = (int j) ->
            System.out.println("value : " + j);
             b.display(20);
}
    }

