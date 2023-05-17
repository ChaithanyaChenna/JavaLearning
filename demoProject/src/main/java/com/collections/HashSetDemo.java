package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[])
    {
        // HashSet hs1=new HashSet(100,0.75f);
       // HashSet hs1=new HashSet(100);
       // HashSet<Integer> hs3=new HashSet<>();
        HashSet hs=new HashSet(); //Default capacity 16 and default Load Factor=0.75

    //add objects or elements to the hashset
    hs.add(100);
    hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);

     //remove()
     hs.remove(16.4);
     System.out.println("After removing the element" +hs);

     //contains()

       System.out.println(hs.contains("welcome"));//true
        System.out.println(hs.contains("Welcome"));//false

     //isEmpty()
     System.out.println(hs.isEmpty());  //false


   //1) reading elements/objects from hashset using for each loop

       /* for (Object e:hs) {
            System.out.println(e);

        }*/
   //2) reading elements by using iterator method

        Iterator it=hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
