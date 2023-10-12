package org.example.reflection;

public class Test {
    private String s;
    private Integer i;

    public Test() { s = "Sahil"; }

    public Test(int a) { s = "Pooja"; }

    public void method1()
    {
        System.out.println("The string is " + s);
    }

    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }

    private void method3()
    {
        System.out.println("Private method invoked");
    }
}
