package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String args[])
    {
        PriorityQueue q=new PriorityQueue();

        //Adding elements add() offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("C");
        //q.add(100);   heterogenious data not allowed in queue
        System.out.println(q);//[A, B, C, C]


        //get element element() peek()
        System.out.println(q.element()); //A  //If queue empty returns no such element exception
        System.out.println(q.peek()); //A  //If queue is empty returns null

        //return and remove the element from queue remove() poll()

       // System.out.println(q.remove()); //A   If queue is empty return exception
       // System.out.println(q); //[B, C, C]

       // System.out.println(q.poll()); //A    If queue is empty returns null
        //System.out.println(q); //[B, C, C]


/*
        Iterator itr=q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
*/

        for (Object ob:q) {
            System.out.println(ob);
        }


    }
}
