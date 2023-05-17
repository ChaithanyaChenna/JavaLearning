package com.exceptionHandlingCheckedExceptions;

public class UsingTryCatch {

    public static void main(String[] args) {

        System.out.println("program execution is started");
        try {
            Thread.sleep(5000);//when we write this statement compiler is showing the an exception so it is checked exception.
        } catch (InterruptedException e) {

        }
        System.out.println("the execution is ended");
    }
}
//when we write a statement Thread.sleep(5000), Then it will hold for 5 milli seconds again the remaining statements will execute.