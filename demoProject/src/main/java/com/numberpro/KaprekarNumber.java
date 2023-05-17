package com.numberpro;

public class KaprekarNumber {
    public static int calLength(int num)
    {
        int len=0;
        while(num>0)
        {
            len++;
           num=num/10;
        }
        return len;
    }
    public static int sumOf(int num) {
        int len = calLength(num);
        int sq = num * num;
        int sum = 0;
       // while (sq > 0) {
            int a = sq % (int) Math.pow(10, len);
            int b = sq / (int) Math.pow(10, len);
           // System.out.println(a);
           // System.out.println(b);
            sum = a + b;
       // }
        return sum;
    }
    public static void main(String[] args)
    {
        //int sum=sumOf(45);
        for(int i=1;i<=100;i++)
        {
            int su=sumOf(i);
            if(su==i)
            {
                 System.out.println(i+" ");
            }
        }
    }
}
