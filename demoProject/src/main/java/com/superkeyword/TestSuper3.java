package com.superkeyword;

class Animal2
{
    Animal2()
    {
        System.out.println("Animal created");
    }
}
class Dog2 extends Animal2
        {
    Dog2()
        {
          super();
           System.out.println("Dog created");
        }

        }

public class TestSuper3 {
    public static void main(String args[])
    {
        Dog2 d2=new Dog2();

    }
}
