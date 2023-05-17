package com.collections;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();

    //1) Adding operations
        set.add("geek");
        set.add("for");
        set.add("geeks");
        System.out.println(set); //[for, geek, geeks]
    //2) contains method
       System.out.println(set.contains("geek")); //true

    //3)first() and last()
        System.out.println("First valus in the tree set is :: "+set.first()); //for
        System.out.println("The last value in the tree set is :: "+set.last()); //geeks

        String val="geek";
        // Find the values just greater
        // and smaller than the above string

        System.out.println("higher : "+set.higher(val)); //geeks  .....If not returns null
        System.out.println("Lower : "+set.lower(val)); //for  .........If not returns null
    }
}
