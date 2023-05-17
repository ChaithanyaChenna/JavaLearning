package com.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        Student s1=new Student(103,12,"Adithi");
        Student s2=new Student(101,13,"Gagan");
        Student s3=new Student(102,14,"Puneeth");
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collections.sort(al);
        // System.out.println(al);
        for (Student s:al){
            System.out.println(s.id+" "+s.rollNum+" "+s.name);
        }
        //Sorting in reverse order
        Collections.sort(al,Collections.reverseOrder());
        for (Student s:al){
            System.out.println(s.id+" "+s.rollNum+" "+s.name);
        }

    }
}
