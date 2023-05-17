package com.exceptionHandlingNonCheckedExceptions;

public class NullpointerExceptionDemmo1 {

    public static void main(String[] args) {
        String str=null;

        //if it is exception catch block will execute

        try
        {
            System.out.println(str.length()); //here we can apply any string methods
        }
        catch (Exception e)  //Exception is a class which can specify generally for any kind of exception
        {
            System.out.println("executes catch block");
        }


        String str1="welcome";
        try
        {
            System.out.println(str1.length());
        }
        catch (Exception e)
        {
            System.out.println("executes catch block");
        }
    }
}
