package com.sdetAssigments2;

public class Calculations implements A,B{
    @Override
    public void add() {
        System.out.println(a+b);
    }

    @Override
    public void mul() {
        System.out.println(x*y);

    }

    public static void main(String[] args) {
        Calculations c=new Calculations();
        c.add();
        c.mul();
    }
}
