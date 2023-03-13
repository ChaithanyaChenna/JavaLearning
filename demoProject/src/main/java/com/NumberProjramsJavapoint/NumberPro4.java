package com.NumberProjramsJavapoint;

public class NumberPro4 {
    //4) Program to print all Disarium numbers between 1 to 100
   // static int rem;
    public static int calLength(int num)
    {
        int rem;
        int len=0;
        while(num!=0)
        {
            rem=num%10;
            len=len+1;
            num=num/10;
        }
        return len;

    }
    public static int sumOfDigits(int num)
    {
        int rem,sum=0;
        int len=calLength(num);
        while(num>0)
        {
            rem=num%10;
            sum=sum+(int)Math.pow(rem,len);
            len--;
            num=num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int result;
        for(int i=1;i<=100;i++)
        {
         result=sumOfDigits(i);

         if(result==i)
         {
             System.out.println(i);
         }
        }
          }
}
