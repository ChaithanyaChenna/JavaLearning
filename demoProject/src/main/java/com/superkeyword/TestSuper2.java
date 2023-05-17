package com.superkeyword;


class Animal1
{
    void eating()
    {
        System.out.println("eating...");
    }
}
class Dog1 extends Animal1{
    void eating()
    {
        System.out.println("eating bread");
        super.eating();

            }
}

public class TestSuper2 {
    public static void main(String args[]) {
        Dog1 d1 = new Dog1();
        d1.eating();

    }
}
