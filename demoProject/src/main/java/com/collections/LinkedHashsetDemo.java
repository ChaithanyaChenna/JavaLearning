package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String args[])
    {
       // LinkedHashSet lh=new LinkedHashSet();
         LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
//        HashSet hs=new HashSet();
//        hs.add(100);
//        hs.add(200);
//        hs.add(300);
//        hs.add(400);
//        System.out.println(hs);


        lh1.add(100);
        lh1.add(200);
        lh1.add(300);
        lh1.add(400);
        System.out.println(lh1);  //[100, 200, 300, 400]


    }
}
