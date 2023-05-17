package com.collectionsHashMap;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Days1 {
    public static void main(String[] args) {
        //System.out.println(Days.MONDAY);

        Set<Days> s = EnumSet.of((Days.WEDNESDAY));
        //Travesin
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<Days>    s1=EnumSet.allOf(Days.class);
    Iterator<Days> it1= s1.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        Set<Days> s3=EnumSet.noneOf(Days.class);

        Iterator it2=s3.iterator();
    while(it2.hasNext())
    {
        System.out.println(it2.next());
    }
    }
    }

