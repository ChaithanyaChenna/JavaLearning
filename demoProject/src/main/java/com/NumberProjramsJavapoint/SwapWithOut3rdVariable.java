package com.NumberProjramsJavapoint;

public class SwapWithOut3rdVariable {
    public static void main(String[] args)
    {
        int a=40;
        int b=20;
        System.out.println("a value before swaping is " +a);
        System.out.println("b value before  swaping " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value after swaping is " +a);
        System.out.println("b value after swaping " +b);
    }
}
