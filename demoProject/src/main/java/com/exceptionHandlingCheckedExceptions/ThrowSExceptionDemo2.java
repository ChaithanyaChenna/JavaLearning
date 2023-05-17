package com.exceptionHandlingCheckedExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowSExceptionDemo2 {
    public static void main(String[] args) throws IOException, InterruptedException { //here we can specify multiple exceptions using coma(,)
        FileReader f=null;
        f=new FileReader("C:\\users\\My Pc\\IdeaProjects\\demoProject\\src\\main\\resources\\abc.txt");
        BufferedReader b=new BufferedReader(f);  //IOException
        System.out.println(b.readLine());
        Thread.sleep(3000);   //InterruptedException
        System.out.println("program ends");
    }
}
