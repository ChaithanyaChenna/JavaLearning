package com.NumberProjramsJavapoint;

import java.util.Scanner;

public class SumWithoutModulus {
    //static int sum=0;
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      String str=sc.nextLine();
      int sum=0;
      for(int i=0;i<str.length();i++)
      {
          System.out.println(str.charAt(i));
          sum = sum + Character.getNumericValue(str.charAt(i));
      }
      System.out.println(sum);

    }
}
