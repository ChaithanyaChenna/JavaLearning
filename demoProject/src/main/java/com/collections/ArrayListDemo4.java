package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student{
    int rollNo,age;
    String name;
    Student(String name,int rollNo,int age)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class ArrayListDemo4 {
    public static void main(String args[])
    {
        Student s1=new Student("Chai",4,26);
        Student s2=new Student("Adithi",6,22);
        Student s3=new Student("sushma",5,25);
        Student s4=new Student("sahana",7,28);
        Student s5=new Student("Bhanavi",8,29);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

       System.out.println(list.size());
       System.out.println(list);
       System.out.println(list.get(0));
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext())
        {
            Student stu=itr.next();
            System.out.println("age="+stu.getAge()+"rollNo="+stu.getRollNo());
        }

       list.remove(0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Student s6=new Student("Baby",9,28);
        list.add(2,s6);
        System.out.println(list);
        list.clone();
        System.out.println(list);

       System.out.println( list.contains(s6));
      System.out.println(list.get(0));
      list.set(0,s6);
    }

}
