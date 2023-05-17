package com.java8BySdet;

public class Demo1  {

  /*  @Override
    public void m1(int a) {
        System.out.println(a);
    }*/

    public static void main(String[] args) {
/*        I1 a=new Demo1();
        a.m1(10);*/
        I1 a1=a-> System.out.println(a);
        a1.m1(10);
    }
    }

