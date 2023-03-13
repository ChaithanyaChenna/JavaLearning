package com.NumberProjramsJavapoint;

public class HarshadNum {
    public static void main(String args[])
    {
        int num=200,rem,sum=0,n;
        n=num;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(n%sum==0)
        {
            System.out.println("the given number is harshad number");
        }
        else
        {
            System.out.println("the given number is not harshad number");
        }
    }
}
