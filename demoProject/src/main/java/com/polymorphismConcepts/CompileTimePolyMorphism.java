package com.polymorphismConcepts;

public class CompileTimePolyMorphism {

   static  void m1(int a,int b)
    {
        System.out.println(a+b);
    }
    static void m2(int a,float b)
    {
        System.out.println(a*b);
    }
    public static void main(String[] args) {

        CompileTimePolyMorphism c=new CompileTimePolyMorphism();
        c.m1(2,3);
        c.m2(4,3.1f);
    }
}
