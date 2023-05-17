package com.accessModifiesrExamples;

import com.accessModifiersExample2.A;

public class ProtectedDemo extends A {

    public static void main(String[] args) {
        PrivateDemo p=new PrivateDemo();
        System.out.println(p.a);
        p.m1();
    }
}
