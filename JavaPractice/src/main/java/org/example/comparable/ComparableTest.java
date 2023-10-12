package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

    public static void main(String[] args){
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(12, "Sahil"));
        al.add(new Student(19, "Pooja"));
        al.add(new Student(02, "Test"));

        Collections.sort(al);

        for(Student st : al){
            System.out.println(st.id +" - "+ st.name);
        }

    }
}
