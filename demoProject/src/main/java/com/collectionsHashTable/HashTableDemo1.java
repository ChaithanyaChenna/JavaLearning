package com.collectionsHashTable;

import java.util.Hashtable;

public class HashTableDemo1 {
    public static void main(String[] args) {
       // Hashtable h=new Hashtable<>(); //capacity is 11 and loadfactor is 0.75
       // Hashtable h1=new Hashtable<>(initial capacity);
       // Hashtable h2=new Hashtable<>(initial capacity,load factor);

       Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(101,"john");
        ht.put(102,"David");
        ht.put(103,"Smith");
        //ht.put(null,"x");   //NullPointerException
       // ht.put(104,null);   //NullPointerException

        System.out.println(ht);  // {103=Smith, 102=David, 101=john}  //insertion order is not preserved which
                                                                    // ever order we inserted the data
                                                                  //in the same order will not get the output.
        System.out.println(ht.get(101)); //john
        ht.remove(101);
        System.out.println(ht);  //{103=Smith, 102=David}
        System.out.println(ht.containsKey(102));  //true
        System.out.println(ht.containsKey(105));  //false

        System.out.println(ht.contains("john")); //false
        System.out.println(ht.contains("Smith")); //true

        System.out.println(ht.isEmpty()); //false

        System.out.println(ht.keySet());  //[103, 102]

        System.out.println(ht.values());  //[Smith, David]


        for (Integer i:ht.keySet()) {

            System.out.println(i +" "+ht.get(i));
        }

       /* for (String str:ht.values()) {
            System.out.println(str);
        }*/


    }
}
