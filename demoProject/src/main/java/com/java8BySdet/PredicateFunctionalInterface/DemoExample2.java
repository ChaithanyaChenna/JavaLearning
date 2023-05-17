package com.java8BySdet.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class DemoExample2 {
    public static void main(String[] args) {
        String str[]={"Smith","scot","David","johner"};
        Predicate<String> p=s->s.length()>4;
//        for(String name:str)
//        {
//            if(p.test(name))
//            {
//                System.out.println(name);
//            }
//        }
        for(String name:str)
        {
            if(name.length()>4)
            {
                System.out.println(name);
            }
        }
    }
}
