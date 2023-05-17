package com.java8concepts;

public interface DefaultMethod1 {
    default void m1()
    {
        System.out.println("default method");
    }

}

class Test implements DefaultMethod1
{

    @Override
    public void m1() {
       DefaultMethod1.super.m1();
        System.out.println("overriding method");
    }

    public static void main(String[] args) {

        Test t=new Test();
        t.m1();  //default method
    }
}
