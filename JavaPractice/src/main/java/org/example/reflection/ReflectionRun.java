package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRun
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Test t1 = new Test();

        Class c1 = t1.getClass();
        System.out.println("The name of class is " + c1.getName());

        Constructor[] constructors = c1.getConstructors();

        for(Constructor c : constructors){
            System.out.println(c.getName());
        }


        Method[] methods = t1.getClass().getDeclaredMethods();
        for(Method m : methods){
            //System.out.println(m.getName());
            if(m.getName().equals("method3")){
                m.setAccessible(true);
                m.invoke(t1);
                break;
            }
        }

        Field[] fields = t1.getClass().getDeclaredFields();
        for(Field f : fields){
            //System.out.println(f.getName());
            if(f.getName().equals("s")){
                f.setAccessible(true);
                f.set(t1, "New");
                break;
            }
        }

        Field f = t1.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println(f.get(t1));
    }
}
