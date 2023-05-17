package com.NumberProjramsJavapoint;

public class StrToInt {
    public static void main(String args[])
    {
        int rem,sum=0;
        String a = "123";
        int num=Integer.parseInt(a);
        System.out.println(num);
        int num1=num;
        System.out.println((9/10));
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(num1%sum==0)
        {
            System.out.println("The given number is Harshad Number");
        }
        else {
            System.out.println("The given number is not Harshad number");
        }

    }
}
