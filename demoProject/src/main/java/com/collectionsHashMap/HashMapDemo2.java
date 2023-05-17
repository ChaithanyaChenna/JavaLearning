package com.collectionsHashMap;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {


       // HashMap m1 = new HashMap<>();
       /*

        m1.put(101, "John");
        m1.put(102, "David");
        m1.put(103, "Levis");
        m1.put(104, "scott");
        m1.put(105, "Marry");
        System.out.println(m1);

        //This will return all the keys as a set
        System.out.println(m1.keySet()); //[101, 102, 103, 104, 105]

        //to get separate keys

        for (Object key:m1.keySet()) {  // here every key is treated as object
            System.out.println(key);
        }*/

        HashMap<Integer,String> m1=new HashMap<>();

        m1.put(101, "John");
        m1.put(102, "David");
        m1.put(103, "Levis");
        m1.put(104, "scott");
        m1.put(105, "Marry");
        System.out.println(m1);

        //This will return all the keys as a set
        System.out.println(m1.keySet()); //[101, 102, 103, 104, 105]

        //to get separate keys

        for (Integer key:m1.keySet()) {
            System.out.println(key);
        }

        //To get only the values
        System.out.println(m1.values());  //[John, David, x, scott, Marry]
        for (String str: m1.values() ){
            System.out.println(str);
        }

        for (Object i:m1.keySet() ) {
            System.out.println(i+" "+m1.get(i));

        }
    }
}
