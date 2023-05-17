package com.comparatorInterface;

import java.util.Comparator;

public class AgeComoarator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Student s1=o1;
        Student s2=o2;
        if(s1.age==s2.age)
            return 0;
        else if (s1.age>s2.age)
           return 1;
        else return -1;
    }
}
