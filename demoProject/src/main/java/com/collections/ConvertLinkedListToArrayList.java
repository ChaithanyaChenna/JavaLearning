package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
    public static void main(String args[])
    {
        LinkedList list=new LinkedList<>();
        list.add(1);
        list.add("bhdhdsb");
        list.add(3);
        list.add(4);
        System.out.println(list);
        ArrayList list1=new ArrayList<>(list);
        System.out.println(list1);
        for (Object a:list1) {
            System.out.println(a);

        }

    }
}
