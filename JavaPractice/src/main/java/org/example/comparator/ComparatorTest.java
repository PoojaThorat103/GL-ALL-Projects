package org.example.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(12, "Sahil"));
        al.add(new Student(19, "Pooja"));
        al.add(new Student(02, "Test"));

        Collections.sort(al,new IDComparator());

        for(Student st : al){
            System.out.println(st.id +" -- "+st.name);
        }

        System.out.println("----------------------------------");

        Collections.sort(al,new NameComparator());

        for(Student st : al){
            System.out.println(st.id +" -- "+st.name);
        }
    }
}
