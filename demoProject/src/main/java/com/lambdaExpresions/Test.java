package com.lambdaExpresions;
@FunctionalInterface
interface Cab{
    public void bookCab();
    //public void m1();  //Functional interface should contain single abstract method

}
class Ola implements Cab{

    @Override
    public void bookCab() {
       // System.out.println("Ola cab is booked");
        // () -> {System.out.println("Ola cab is booked");};
    }
}

public class Test {

    public static void main(String args[])
    {
     Cab c=() -> {System.out.println("Ola cab is booked");};
     c.bookCab();
    }
}
