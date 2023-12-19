package org.example.Lambda;

import java.net.StandardSocketOptions;
import java.util.function.Function;
import java.util.function.Predicate;

public class tedstq {

    public static void main(String[] args){


       /*Drawable d = new Drawable(){
            public int draw(int a){
                return a+5;
            };
        };

        int b = d.draw(10);
        System.out.println(b);*/

           //   Using lambda expression

       Drawable d1 = (c) -> {
            int sum = c+10;
            return sum;
        };

        int e = d1.draw(15);
        System.out.println(e);



        Printable pp = () ->{
            System.out.println("-----------------------Print  ");
        };
         pp.show();

    // we call both ways above and below

        Printable p = () -> System.out.println("hii");
        p.show();



        Predicate<Integer> p1 = (g) -> g%2 == 0;
        System.out.println(p1.test(7));

        Function<Integer, Integer> f = (t) -> t*10;

        int mul = f.apply(10);
        System.out.println(mul);


        Function<Integer, Integer> f11 = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer o) {
                return o*0;
            }
        };

        f11.apply(13);

    }


}
