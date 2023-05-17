package com.collectionsHashMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Smith");
        map.put(102,"Maxwell");
        map.put(103,"David");

        for (Map.Entry entry:map.entrySet())
        {
           System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
