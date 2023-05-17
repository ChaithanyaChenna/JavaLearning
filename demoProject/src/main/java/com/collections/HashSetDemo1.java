package com.collections;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String args[]) {
        HashSet<Integer> evenNumber = new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Hashset :" +evenNumber);

        HashSet<Integer> number = new HashSet<Integer>();
        number.addAll(evenNumber);
        number.add(8);
        System.out.println("new hashset :"+number);
        number.removeAll(evenNumber);
        System.out.println(number);//[8]



    }
}
