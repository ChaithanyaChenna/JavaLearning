package com.exceptionHandlingNonCheckedExceptions;

public class FinallyBlockCase2 {
    public static void main(String[] args) {
        System.out.println("execution started");
        int a=10;

       // CASE 2: exception occur not handled
        try
        {
            System.out.println(a/0);
        }
        catch(NullPointerException e)
        {
            System.out.println("enetered into nullpointer exception");
        }
        finally {
            System.out.println("entered into finally block");
        }
        }
}
