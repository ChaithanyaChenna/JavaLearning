package com.collectionsHashTable;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class HashTableDemo3 {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<>();
        h.put(101,"Amit");
        h.put(102,"Aman");
        h.put(103,"David");
        System.out.println(h.get(101));
        System.out.println(h.keySet());
        for (Integer i:h.keySet())
        {
            System.out.println(i);
        }
        System.out.println(h.values());
        for (String str:h.values())
        {
            System.out.println(str);

        }
        System.out.println(h.entrySet());
        for (Map.Entry me:h.entrySet()) {

            System.out.println(me.getKey()+" "+me.getValue());

        }
    }
}
