package com.NumberProjramsJavapoint;

public class SwapNums {
    int a,b;
    SwapNums(int i,int j)
    {
        a=i;
        b=j;
    }
    public void swap()
    {
      int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);

    }
    public static void main(String[] args)
    {
        SwapNums s=new SwapNums(20,30);


       // int a=20,b=30;
        s.swap();
//        System.out.println(a);
//        System.out.println(b);

    }
}

