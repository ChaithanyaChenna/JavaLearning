package com.java8concepts;

import java.net.StandardSocketOptions;

public interface DefaultMethods {
     void m1();
    void m2();

    default void m3() {
        System.out.println("default");

    }
}
class A implements DefaultMethods
{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
    public static void main(String args[])
    {
        System.out.println("hi");
    }
}
