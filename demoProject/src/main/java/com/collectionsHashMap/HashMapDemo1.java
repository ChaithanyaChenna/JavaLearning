package com.collectionsHashMap;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap m=new HashMap<>();
        //HashMap<Integer,String> m1=new HashMap<>();
        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Levis");
        m.put(104,"scott");
        m.put(105,"Marry");
        m.put(103,"x");
        m.put(106,"David");
        System.out.println(m); //{101=John, 102=David, 103=x, 104=scott, 105=Marry, 106=David}
        System.out.println(m.get(101)); //John
        m.remove(106);
        System.out.println(m); //{101=John, 102=David, 103=x, 104=scott, 105=Marry}

        System.out.println(m.containsKey(102)); //true
        System.out.println(m.containsKey(108)); //false

        System.out.println(m.containsValue("John"));//true
        System.out.println(m.containsValue("d"));//false

        System.out.println(m.isEmpty()); //false

        //This will return all the keys as a set
        System.out.println(m.keySet()); //[101, 102, 103, 104, 105]

        //To get only the values
        System.out.println(m.values());  //[John, David, x, scott, Marry]

        //To get all the entries as a Set
        System.out.println(m.entrySet());  //[101=John, 102=David, 103=x, 104=scott, 105=Marry]

    }
}
