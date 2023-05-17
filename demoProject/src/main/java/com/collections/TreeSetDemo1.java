package com.collections;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*TreeSet<Student1> set1 = new TreeSet<>();
        Student1 s1=new Student1(10,"Adithi");
        Student1 s2=new Student1(20,"chaithanya");
        Student1 s3=new Student1(30,"sonu");

        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
 System.out.println(set1);//Exception in thread "main" java.lang.ClassCastException:Because Student1 is a user defined class and which is not implemented by comparabele interface

*/
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println(set);
        TreeSet ts=new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add("hi");
        System.out.println(ts);//TreeSet allows generic values,if it is heterogenious data then throws classCastException.


    }
}
