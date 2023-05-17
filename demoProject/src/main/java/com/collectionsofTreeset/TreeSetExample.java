package com.collectionsofTreeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Book> ts=new TreeSet<>();

     /*   Book b1=new Book(187,"Adithi","Robert");
        Book b2=new Book(101,"chithra","Albert");
        Book b3=new Book(120,"sushma","Edison");*/

        ts.add(new Book(187,"Adithi","Robert"));
        ts.add(new Book(101,"chithra","Albert"));
        ts.add(new Book(120,"sushma","Edison"));


        for (Book b:ts) {

           System.out.println(b.id+" "+b.name+" "+b.author);
         // System.out.println(b);

        }


    }
}
