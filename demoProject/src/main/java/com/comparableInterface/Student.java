package com.comparableInterface;

public class Student implements Comparable<Student> {

    String name;
    int rollNum,id;

    Student(int id,int rollNum,String name)
    {
        this.id=id;
        this.rollNum=rollNum;
        this.name=name;

    }

    @Override
    public int compareTo(Student st) {
        if(id==st.id)
            return 0;
        else if(id> st.id)
        return 1;
         else
            return -1;
        }
}
