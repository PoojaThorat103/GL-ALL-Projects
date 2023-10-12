package org.example.Lambda;

public class LambdaExpressionExample {
    public static void main(String[] args){
        /*
        Drawable d = new Drawable(){
            @Override
            public void draw(int a) {
                System.out.println("print draw");
            }
        };
        d.draw(10);
        */

        Drawable d2 = p1 -> {
            int j = p1*2;
            return j;
        };

        int i = d2.draw(12);
        System.out.println(i);


        Drawable d3 = (p1) -> {return p1*3;};
        int k = d3.draw(3);
        System.out.println(k);


        Printable p = () -> {System.out.println("hiii");};
        p.show();

    }
}
