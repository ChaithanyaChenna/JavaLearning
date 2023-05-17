package com.NumberProjramsJavapoint;

import java.util.Scanner;

public class SumWithoutModulus2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            sum=sum+Character.getNumericValue(ch[i]);
        }
        System.out.println(sum);
    }
}
