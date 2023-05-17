package com.numberpro;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args)
    {
        int count=1,sum=0,average;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n value");
        int n=sc.nextInt();
        while(count<=n)
        {
            System.out.println("enter "+count+"number ");
            int a=sc.nextInt();
            sum=sum+a;
            count++;
        }
        System.out.println(average=sum/n);

    }
}
