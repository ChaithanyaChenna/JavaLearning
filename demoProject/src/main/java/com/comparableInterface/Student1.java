package com.comparableInterface;

public class Student1 implements Comparable<Student1>{

    String name;
    int rollNum,id;

    Student1(int id,int rollNum,String name)
    {
        this.id=id;
        this.rollNum=rollNum;
        this.name=name;

    }

    @Override
    public int compareTo(Student1 st) {
        if(id==st.id)
            return 0;
        else if(id< st.id)
            return 1;
        else
            return -1;
    }
}
