package com.numberpro;

import java.util.Scanner;

public class TwistedPrimeNumber {

    public static int calReverse(int num)
    {
        int rem,rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the prime number");
        int num = sc.nextInt();
        int n=calReverse(num);
        int temp=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("the given number is twisted prime number");
        }
        else {
            System.out.println("the given number is not twisted prime number");
        }
    }
}
