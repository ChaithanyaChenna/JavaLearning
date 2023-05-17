package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.add(1.3);
        list.add("Java");
        list.add('a');
        list.add(4);
        list.add("python");

    //Reading the data from linked list using for loop
       /* for(int i=0;i<list.size();i++)
           {
                System.out.println(list.get(i));
           }*/


    //Reading the data from linked list using for each loop

        for (Object a:list)
        {
            System.out.println(a);
        }


    //Reading the data from linked list using iterator()

        Iterator it= list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
