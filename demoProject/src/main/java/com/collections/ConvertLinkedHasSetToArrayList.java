package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConvertLinkedHasSetToArrayList {
    public static void main(String args[]) {
       LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("hi");
        set.add("hello");
        set.add("welcome");
        System.out.println(set);
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
