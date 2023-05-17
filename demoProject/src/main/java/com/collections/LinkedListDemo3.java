package com.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String args[]) {
        LinkedList<String> list=new LinkedList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("A");
        list.add("B");
        list.add("C");

        LinkedList new_list=new LinkedList();
        new_list.addAll(list);
        System.out.println(new_list); //[X, Y, Z, A, B, C]
        new_list.removeAll(list);
        System.out.println(new_list);//[]
       // System.out.println(list);

        //sort()....Collections.sort()
        System.out.println("before sorting  "+list);
        Collections.sort(list);
        System.out.println("after sorting  "+list);//[A, B, C, X, Y, Z]

        //reverse order[OR] Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After reversing "+list);

        Collections.shuffle(list);
        System.out.println("After shuffeling the element " +list); //[X, Z, C, Y, A, B]


    }
}
