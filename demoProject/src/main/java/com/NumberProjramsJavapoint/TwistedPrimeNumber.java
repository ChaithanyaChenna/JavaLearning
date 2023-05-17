package com.NumberProjramsJavapoint;

import java.util.Scanner;

public class TwistedPrimeNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the prime number");
        int num=sc.nextInt();

        int rem,rev=0,temp=0;

        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        for(int i=2;i<=rev-1;i++)
        {
            if(rev%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("the given number is twisted prime number");
        }
        else
        {
            System.out.println("the given number is not twisted prime number");
        }
    }
}
