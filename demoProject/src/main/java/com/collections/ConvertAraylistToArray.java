package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertAraylistToArray {
    public static void main(String args[])
    {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(2);
       Object[] obj =l1.toArray();
       System.out.println(obj);
        for (Object obj1:obj) {
            System.out.println(obj1);

        }
    }
}
