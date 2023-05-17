package com.collections;

import com.collectionsjavatpoint.Book;
import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String args[])
    {
        //Declare an arraylist
        ArrayList al=new ArrayList();//Arralist which stores heterogenious data
      //  ArrayList<Integer> al=new ArrayList<Integer>();  //Arralist which stores homogenious data
      //  ArrayList<String> al1=new ArrayList<String>();   //Arralist which stores homogenious data
       // List al2=new ArrayList();//This way also we can declare an ArrayList

        //add new elements to the array list
        Boolean a= al.add(1);
        System.out.println(a);
        al.add("string");
        al.add('s');
        al.add("hi");
        System.out.println(al);  //[1,string,s,hi]
       /* Collections.sort(al, new Comparator<Book>() {
        });

        //size
        System.out.println(al.size());//4

        al.remove(1);
        System.out.println("After removing the elemnt at 1st index" +al);  //[1,s,hi]

        //insert new elemnet in to ArrayList
        al.add(2,"python");
        System.out.println("After adding new element" +al);//[1,s,python,hi]*/

        // retriew specific element
        System.out.println( al.get(1)); //[s]

        //change element or replace
        al.set(1,"java");
        System.out.println("After replacing the old value with new value" +al);

        //search with contains()
      System.out.println(al.contains("java")); //true
        System.out.println(al.contains("javaProgramming")); //false

        //IsEmpty()
        System.out.println(al.isEmpty()); //false

        //read the data from array list in 3 different ways

        //1) using for loop
        System.out.println("reading the data from for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        //2) using for each loop
        System.out.println("reading the data by using for each loop");
        for (Object e:al)  //here Object strores all king of data
        {
            System.out.println(e);
        }

        //using iterator() method
        System.out.println("reading the data by using iterator method");
        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());

        }
    }
}
