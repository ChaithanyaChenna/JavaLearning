package com.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestSort {

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        Student s1=new Student(102,23,"Abhi");
        Student s2=new Student(101,20,"Rubhi");
        Student s3=new Student(103,22,"Pubhi");
        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println(("Before sorting"));
        Iterator it=al.iterator();
        while(it.hasNext())
        {
            Student st= (Student) it.next();
            System.out.println(st.rollNo+" "+st.age+" "+st.name);
        }


        System.out.println("After sorting on the basis of age");
        Collections.sort(al, new AgeComoarator());
        Iterator it1=al.iterator();
        while(it1.hasNext())
        {
            Student st1= (Student) it1.next();
            System.out.println(st1.rollNo+" "+st1.age+" "+st1.name);
        }

        System.out.println("After sorting on the basi of name");
        Collections.sort(al,new NameComparator());
        Iterator it2=al.iterator();
        while(it2.hasNext())
        {
            Student st1= (Student) it2.next();
            System.out.println(st1.rollNo+" "+st1.age+" "+st1.name);
        }



    }
}
