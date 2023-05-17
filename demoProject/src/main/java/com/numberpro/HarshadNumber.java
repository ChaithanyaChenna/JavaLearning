package com.numberpro;

public class HarshadNumber {
    public static int calSum(int num)
    {
        int rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int num=20;
        int result=num;
        int sum=calSum(num);
        if(result%sum==0)
        {
            System.out.println("The given number is Harshad number");
        }
        else
        {
            System.out.println("The given number is not harshad number");
        }
    }
}
