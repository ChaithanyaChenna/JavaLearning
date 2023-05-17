package com.collections;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String args[])
    {
        //Declare a linkedlist to store heterogenious data
        LinkedList list=new LinkedList<>();
        //add elements to the linked list
        list.add("Java");
        list.add(1);
        list.add(null);
        list.add('e');
        System.out.println(list);//[Java, 1, null, e]

        //to print the size of the linked list
        System.out.println(list.size());//4

        //remove using index
        list.remove(3);
        System.out.println("After removing element or node"+list);//[Java, 1, null]

        //insert//adding element in the middle of linked list
        list.add(2,"MyElement");
        System.out.println("After inserting the new element"+list);//[Java, 1, MyElement, null]

        //retriving the element from linkedlist
        System.out.println(list.get(0));//java

        //change the value[OR} replace the value
        list.set(3,"college");
        System.out.println("After replacing the value null by college  "+list);

        //contains() method which fetch given object present in linked list or not
        System.out.println(list.contains("Java"));//true
        System.out.println(list.contains("python"));//false

        //IsEmpty()
        System.out.println(list.isEmpty());//false


        //Declare a linkedlist to store Homogenious data
        LinkedList<Integer> l=new LinkedList<>();
        LinkedList<Float> list1=new LinkedList<>();

    }
}
