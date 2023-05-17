package com.collections;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("geek");
        ts.add("for");
        ts.add("geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        System.out.println("initial tree set is "+ts); //[A, B, Z, for, geek, geeks]


        // Removing a specific existing element inserted
        ts.remove("B");
        System.out.println("after removing element "+ts);  //[A, Z, for, geek, geeks]

        // Now removing the first element
        // using pollFirst() method
        System.out.println(ts.pollFirst()); //A

        // Again printing the updated TreeSet

        System.out.println("after removing first " +ts); //[Z, for, geek, geeks]

        // Removing the last element
        // using pollLast() method
        ts.pollLast();


        // Lastly printing the elements of TreeSet remaining
        // to figure out pollLast() method
        System.out.println("After removing last " + ts); //[Z, for, geek]



    }
}
