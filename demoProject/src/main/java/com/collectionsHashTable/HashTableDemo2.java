package com.collectionsHashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"David");
        ht.put(102,"Smith");
        ht.put(103,"Jason");

        //WORK ON ENTRY METHODS
        System.out.println(ht);

       System.out.println(ht.entrySet());

       for(Map.Entry entry:ht.entrySet())
       {
           System.out.println(entry.getKey()+" "+entry.getValue());
       }

       //iterator

        Set s=ht.entrySet();

       Iterator it=s.iterator();

       while(it.hasNext())
       {
           Map.Entry entry = (Map.Entry) it.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
}
