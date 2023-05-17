package com.collectionsHashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Amit");
        map.put(104,"Rahul");
        map.put(102,"Vijay");
        map.put(103,"Bin");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        }
}
