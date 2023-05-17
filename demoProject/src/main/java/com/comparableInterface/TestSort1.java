package com.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
    public static void main(String[] args) {
        ArrayList<Student1> al1=new ArrayList<>();
        Student1 s1=new Student1(103,12,"Adithi");
        Student1 s2=new Student1(101,13,"Gagan");
        Student1 s3=new Student1(102,14,"Puneeth");
        al1.add(s1);
        al1.add(s2);
        al1.add(s3);
        Collections.sort(al1);
        // System.out.println(al);
        for (Student1 s:al1){
            System.out.println(s.id+" "+s.rollNum+" "+s.name);
        }
    }
    }

