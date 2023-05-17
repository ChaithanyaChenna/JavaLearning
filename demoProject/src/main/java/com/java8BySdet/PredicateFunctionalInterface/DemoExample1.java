package com.java8BySdet.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class DemoExample1  {
    public static void main(String[] args) {

        //ex 1:
        Predicate<Integer>  p= a->(a>10);
        System.out.println(p.test(6)); //false
        System.out.println(p.test(11));//true

        //ex 2:Check the length of the string is greater than 4
        Predicate<String> p1=s->s.length()>6;
        p1.test("welcome");


    }
}
