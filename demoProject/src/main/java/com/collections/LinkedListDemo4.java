package com.collections;

import java.util.LinkedList;

public class LinkedListDemo4 {
    //LinkedList Specific methods which are used to implement stack and queue;

    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        System.out.println(l);  //[dog, dog, cat, horse]

        l.addFirst("lion");
        System.out.println(l);//[lion, dog, dog, cat, horse]

        l.addLast("cow");
        System.out.println(l);//[lion, dog, dog, cat, horse, cow]

        l.removeFirst();
        System.out.println(l);//[dog, dog, cat, horse, cow]

        l.removeLast();
        System.out.println(l);//[dog, dog, cat, horse]

        System.out.println(l.getFirst());//dog

        System.out.println(l.getLast());//horse




    }
}
