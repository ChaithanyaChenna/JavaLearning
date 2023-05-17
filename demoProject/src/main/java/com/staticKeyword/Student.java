package com.staticKeyword;

public class Student {
    int rollNo;
    String name;
    static String college="EastPoint";
    Student(int rollNo,String name)
    {
       this.rollNo=rollNo;
        this.name=name;
    }
    void display()
    {
        System.out.println(rollNo+" "+name+" "+college);
    }
    public static void main(String args[])
    {
        Student s=new Student(2,"chaithanya");
        s.display();
        Student s1=new Student(4,"Adithi");
        s1.display();
    }
}
