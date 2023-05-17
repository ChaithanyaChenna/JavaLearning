package com.java8lambdaexpressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

   /* public static int squareInt(int n)
    {
        return n*n;
    }
*/
    public static void main(String[] args) {

        //System.out.println("The square of 40 :"+squareInt(40));

        //To find square root of a number
        Function<Integer,Integer> f=n->n*n;
        System.out.println("The square of 20 :"+f.apply(20));


        //To finr whether the given number is even or not
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(4));//true
        System.out.println(p.test(5));//false


    }
}
