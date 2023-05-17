package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashSetToArrayList {
    public static void main(String args[])
    {
        HashSet<String> set=new HashSet<>();
        set.add("hi");
        set.add("hello");
        set.add("welcome");
        System.out.println(set);
        ArrayList<String> list=new ArrayList<>(set);
        System.out.println(list);
    }
}
