package com.encapsulationConcepts;

public class Demo {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getAge());

        System.out.println(obj.getName());

        obj.setAge(30);
        obj.setname("Chenna");

        System.out.println("After seeting the age : " +obj.getAge());

        System.out.println("After setting the name :  " +obj.getName());
    }
}
