package com.NumberProjramsJavapoint;

public class PrimeNo {
    public static void main(String[] args)
    {
       int num=83,temp=0;
       for(int i=2;i<=num-1;i++)
       {
           if(num%i==0)
           {
               temp=temp+1;
           }
       }
       if(temp>1)
       {
           System.out.println("the given number is not a prime");
       }
       else {
           System.out.println("its a prime");
       }
    }
}
