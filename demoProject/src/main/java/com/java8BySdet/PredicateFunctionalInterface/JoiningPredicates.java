package com.java8BySdet.PredicateFunctionalInterface;



//Joining predicates - and,or,negate
//p1---checks number is even
//p2---greater than 50

import java.util.function.Predicate;

public class JoiningPredicates {
    public static void main(String[] args) {
        int a[]={3,40,2,6,7,70,80,60,64,84,83};
        Predicate<Integer> p1= i->i%2==0;
        Predicate<Integer> p2=i->i>50;
        System.out.println("Following numbers are even and greater than 50....");

        for(int i:a)
        {
           if(p1.and(p2).test(i))  // if(p1.test(i)&&p2.test(i))
            {
                System.out.println(i);
            }
        }
        System.out.println("The following are the either even or greater than 50...");
        for(int n:a)
        {

            if(p1.or(p2).test(n))   //if((p1.test(n) || (p2.test(n))
            {
                System.out.println(n);
            }
        }
        //Using Negate operation

        System.out.println("The following are belongs negate operation");
        for(int n:a)
        {
            if(p1.negate().test(n))
            {
                System.out.println(n);
            }
        }
    }
}
