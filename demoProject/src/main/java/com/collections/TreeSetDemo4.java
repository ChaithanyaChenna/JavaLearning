package com.collections;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("geek");
        ts.add("for");
        ts.add("geeks");
        ts.add("A");
        ts.add("B");
        ts.add("C");


        // Now we will be using for each loop in order
        // to iterate through the TreeSet

        for (String val:ts)
        {
            System.out.println(val);
        }
    }
}
