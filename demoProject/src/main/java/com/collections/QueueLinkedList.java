package com.collections;

import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        //Adding elements add() offer()
       list.add(1);
        list.add("hi"); //hetero genious data is allowed
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get head element element()  peek()
       // System.out.println(list.element()); //if queue is empty it returns exception
        //System.out.println(list.peek());      //if queue is empty it returns null

        //return and remove element from the queue
       // System.out.println(list.remove()); //1   //If queue is empty returns noSuchElementException
        System.out.println(list); //[hi, 2, 3]
        System.out.println(list.poll()); //1
        System.out.println(list); //[hi, 2, 3] ////if queue is empty it returns null

    }
}
