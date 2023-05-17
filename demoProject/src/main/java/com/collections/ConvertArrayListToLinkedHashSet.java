package com.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ConvertArrayListToLinkedHashSet {
    public static void main(String args[]) {

        ArrayList<String> set = new ArrayList<>();

        set.add("hi");
        set.add("hello");
        set.add("welcome");
        System.out.println(set);
        LinkedHashSet<String> list = new LinkedHashSet<>(set);

        System.out.println(list);
    }
}
