package com.exceptionHandlingNonCheckedExceptions;

public class OneTryMultipleCatchBlocks {
    public static void main(String[] args) {
        int a=100;
        try
        {
            System.out.println(a/0);
        }
        catch (NullPointerException e)
        {
            System.out.println("Its a Nullpointer exception");
        }
        catch (ArithmeticException r)
        {
            System.out.println("it is a Arithmatic exception");
        }
    }
}
