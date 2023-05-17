package com.exceptionHandlingNonCheckedExceptions;

public class FinallyBlockCase1 {
    public static void main(String[] args) {


        System.out.println("program is started");
        int a=10;

     //CASE:1  Exception doesnot occur
        try
        {
            System.out.println(a/2);
        }
        catch(Exception e)
        {
            System.out.println("entered in to catch block");
        }
        finally {
            System.out.println("Entered into finally block");
        }
    }
}
