package com.sdetAssignments;

public class B implements A {
    @Override
    public void sum() {
        System.out.println(a+b);

    }
    public static void main(String[] args) {

        B b=new B();
        b.sum();
    }


}
