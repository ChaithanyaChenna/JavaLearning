package com.numberpro;

public class HappyNumber
{
    public static int calSum(int num)
    {
        int rem,sum=0;
        while(num>0)
        {
          rem=num%10;
          sum=sum+(rem*rem);
          num=num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int num=13;
        int result=num;

        while(result!=1 && result!=4)
        {
            result=calSum(result);
        }
        if(result==1)
        {
            System.out.println("the given number is happy number");
        }
        else if (result==4) {
            System.out.println("the given number is not happy number");
        }
    }



}
