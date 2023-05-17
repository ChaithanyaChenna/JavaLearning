package com.collectionsHashTable;


import java.util.Hashtable;
import java.util.Map;

public class HashTabledemo4 {
    public static void main(String[] args) {
        Hashtable<Integer,Book> h=new Hashtable<>();
        Book b1=new Book(101,"Adithi","Amith");
        Book b2=new Book(102,"Prabhu","Pritham");
        Book b3=new Book(103,"chithra","Chandan");
        h.put(101,b1);
        h.put(102,b2);
        h.put(103,b3);

        System.out.println(h.entrySet());
       // System.out.println(h.keySet());
        //System.out.println(Integer.valueOf("abc"));
        System.out.println(Integer.valueOf("123"));
        String str="hi";
        int a=10;

        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf('c'));
       // Double.

        for(Integer i:h.keySet())
        {
        //    System.out.println(i+h.get(i));
        }
      /* for( Map.Entry <Integer,Book> entry: h.entrySet())
        {
          int key= entry.getKey();
          Book b= (Book) entry.getValue();
            System.out.println((key + " :Details"));
            System.out.println(b.id+ " "+b.publisher+ " "+b.author);
        }
*/
    }
}
