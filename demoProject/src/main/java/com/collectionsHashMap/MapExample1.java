package com.collectionsHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1
{
    public static void main(String[] args)

    {
        Map m=new HashMap<>();
        m.put(101,"Amith");
        m.put(102,"jim");
        m.put(103,"kelvin");
        m.put(104,"Markswell");
        Set s=m.entrySet();

        Iterator it=s.iterator();
        while(it.hasNext())
        {
            Map.Entry entry= (Map.Entry) it.next();

            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
