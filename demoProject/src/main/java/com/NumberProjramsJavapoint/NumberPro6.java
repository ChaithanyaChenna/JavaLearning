package com.NumberProjramsJavapoint;

public class NumberPro6 {
//    6) Program to print all Pronic numbers between 1 to 100
//A number is said to be pronic number if it is a product of two consecutive numbers.
//6 = 2 x 3
//72 = 8 x 9

    public static boolean isPhonic(int num)
    {
        boolean flag=false;
       for(int j=1;j<=num;j++)
       {
           if(j*(j+1)==num)
           {
               flag=true;
           }
       }
       return flag;
    }
    public static void main(String args[])
    {
        for(int i=1;i<=100;i++)
        {
            if(isPhonic(i))
            {
                System.out.println(i+" ");
            }
        }
    }
}
