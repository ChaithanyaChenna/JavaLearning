package com.collectionsjavatpoint;

import java.util.HashSet;

public class HashsetDemo1 {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB");
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill");
        Book b3=new Book(103,"Operating System","Galvin","Wiley");
        Book b4=new Book(103,"Operating System","Galvin","Wiley");
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
       set.add(b2);
        //System.out.println(b);
        for (Book obj:set){
            System.out.println(obj.id+" "+obj.name+" "+obj.author+" "+obj.publisher);
        }
    }
}
