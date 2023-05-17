package com.PrcaticePrograms;

public class Run implements I1 {

    @Override
    public void m1() {
        System.out.println("Java");
    }

    public static void main(String[] args) {
        I1 obj=new Run();
        obj.m1();
        obj.m2();
    }
}
