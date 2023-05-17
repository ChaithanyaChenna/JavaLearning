package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        //al.set(0,1);
        al.add("x");//adding homogeneous data to to sorting and shuffeling
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
        //If we want to all above objects into one more array then
        ArrayList al1=new ArrayList();
        al1.addAll(al);
        System.out.println(al1);  //[x, Y, Z, A, B, C]

        //remove all
        al1.removeAll(al); // [OR] al1.removeAll[al1]
        System.out.println("after removing all the element  " +al1);
        System.out.println(al);

        //sort......Collections.sort();

        System.out.println("elements in the arraylist" +al);//[x, Y, Z, A, B, C]

        //sorting element in Ascending order
        Collections.sort(al);
        System.out.println("After sorting" +al);//[A, B, C, Y, Z, x]

        //sort these elements in the reverse order/Descending order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("elements in the array after sorting in reverse order" +al);//[x, Z, Y, C, B, A]


        Collections.shuffle(al);
        System.out.println("elements in the array after shuffeling" +al); //[C, Z, B, A, Y, x]

    }

}
