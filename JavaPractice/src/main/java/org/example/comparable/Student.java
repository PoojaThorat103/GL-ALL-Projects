package org.example.comparable;

public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {

        if(id == o.id){
            return 0;
        }else if(id > o.id){
            return 1;
        }else{
            return -1;
        }
    }
}
