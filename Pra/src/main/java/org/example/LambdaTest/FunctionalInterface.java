package org.example.LambdaTest;


@java.lang.FunctionalInterface
 interface A{
    void info();
 }



public class FunctionalInterface {

    public static void main (String [] args){

      /*  //Java Anonymous inner class
        A obj = new A()
        {
            public void info(){
                System.out.println(" This is info --------");
            }
        };
        obj.info();*/

        A obj = () -> System.out.println("Info--------");
        obj.info();

    }







}
