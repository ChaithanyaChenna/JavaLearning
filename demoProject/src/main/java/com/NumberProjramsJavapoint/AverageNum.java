package com.NumberProjramsJavapoint;

import java.util.Scanner;

public class AverageNum {
   // int d,b,c;


    public static void main(String args[])
    {
        AverageNum a=new AverageNum();
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the 1st number");
        int b=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int c=sc.nextInt();
        int d=(b+c)/n;
        System.out.println(d);
    }
}
