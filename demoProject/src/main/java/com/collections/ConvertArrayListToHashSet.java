package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertArrayListToHashSet {
    public static void main(String args[])
    {
        ArrayList<String> set=new ArrayList<>();

        set.add("hi");
        set.add("hello");
        set.add("welcome");
        System.out.println(set);
        HashSet<String> list=new HashSet<>(set);

        System.out.println(list);
    }
}
