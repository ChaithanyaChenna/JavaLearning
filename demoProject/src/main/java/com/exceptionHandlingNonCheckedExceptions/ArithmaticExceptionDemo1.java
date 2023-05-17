package com.exceptionHandlingNonCheckedExceptions;

public class ArithmaticExceptionDemo1{
    public static void main(String[] args) {
        int a = 100;

//below statement throwing arithmatic exception hence catch block is executing
        try {
            System.out.println(a / 0);   //ArithMaticException
        } catch (ArithmeticException e)  //HERE ArithmaticException is predefined class and 'e' is the object....any thing we can give
        {
            System.out.println("entered into catch block");
        }

//BELOW STATEMENT IS NOT THROWING ARITHMATIC EXCEPTION HENCE POINTER WILL NOT NTER INNTO CATCH BLOCK ONLY
        try {
            System.out.println(a / 2);
        } catch (ArithmeticException e) {
            System.out.println("entered into catch block");
        }

    }
}
