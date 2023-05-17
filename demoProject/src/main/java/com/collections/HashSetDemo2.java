package com.collections;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String args[])
    {

        //union,Insertion,Difference
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);

       //union
       // set1.addAll(set2);
       // System.out.println("Union:" +set1); //[1, 2, 3, 4, 5]

       //intersection (common elements from set1 and set2
       // set1.retainAll(set2);
       // System.out.println("intersection :"+set1); //[3,4,5]

        //difference
        //set1.removeAll(set2);
        // System.out.println("difference :" +set1); //[1,2]

       //subset
        System.out.println(set1.containsAll(set2));


    }
}
