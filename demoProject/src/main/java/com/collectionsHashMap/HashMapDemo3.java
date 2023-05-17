package com.collectionsHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
       
        HashMap<Integer,String> m1=new HashMap<>();
        // WORKING ON ENTRY METHODS
        m1.put(101, "John");
        m1.put(102, "David");
        m1.put(103, "Levis");
        m1.put(104, "scott");
        m1.put(105, "Marry");
        
        System.out.println(m1);

        for (Map.Entry entry:m1.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        //WE CAN ALSO RETRIEW THE KEY VALUE DATA BY USING ITEREATOR()

        Set s=m1.entrySet();
        Iterator itr=s.iterator();

        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        
        

    }
}
