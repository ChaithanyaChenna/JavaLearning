package com.accessModifiesrExamples;

import com.accessModifiersExample2.B;

public class PublicDemo1 {
    public static void main(String[] args) {
        B b=new B();
        b.m1();
        System.out.println(b.a);
    }
}
