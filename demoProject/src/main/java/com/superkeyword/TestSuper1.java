package com.superkeyword;

class Animal
{
    String color="white";

}
class Dog extends Animal{
    String color="black";
    void displayColor()
    {
        System.out.println(color);//black
        System.out.println(super.color);//white
    }
}
public class TestSuper1 {
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.displayColor();
    }
}
