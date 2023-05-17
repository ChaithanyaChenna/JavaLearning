package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListToLinkedList {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        LinkedList<Integer> l1=new LinkedList<>(list);
            System.out.println(l1);

        }

    }
