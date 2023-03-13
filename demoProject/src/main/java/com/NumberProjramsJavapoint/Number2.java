package com.NumberProjramsJavapoint;

public class Number2 {
    //Disarium Number.... 11 + 72 + 53 = 1 + 49 + 125 = 175

    public static int calLength(int num)
    {
       int len=0;
       while(num!=0)
       {
           len=len+1;
           num=num/10;
       }
       return len;
    }
    public static void main(String args[])
    {
        int num=125,rem,sum=0;
        int len=calLength(num);
        int n=num;
        System.out.println(9%10);
        while(num>0)
        {
            rem=num%10;
            sum=sum+(int) Math.pow(rem,len);
            num=num/10;
            len--;
        }
        if(n==sum)
        {
            System.out.println("the given number is disarium number");
        }
        else {
            System.out.println("the given number is not disarium number");
        }
    }
}
