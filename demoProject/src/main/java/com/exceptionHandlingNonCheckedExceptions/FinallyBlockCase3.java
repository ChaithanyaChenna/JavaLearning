package com.exceptionHandlingNonCheckedExceptions;

public class FinallyBlockCase3 {

    public static void main(String[] args) {
        System.out.println("program execution started");
        int a=10;

        //CASE 3:Exception occured and handled it properly

        try
        {
            System.out.println(a/0);
        }
        catch(Exception e)
        {
            System.out.println("entered into catch block");
        }
        finally {
            System.out.println("eneterd  into finally block");
        }
    }
}
