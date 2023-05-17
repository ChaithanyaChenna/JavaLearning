package com.collections;

import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet<StringBuffer> tr=new TreeSet<>();
        tr.add(new StringBuffer("A"));
        tr.add(new StringBuffer("Z"));
        tr.add(new StringBuffer("L"));
        tr.add(new StringBuffer("B"));
        tr.add(new StringBuffer(1));
        System.out.println(tr);

    }
}
