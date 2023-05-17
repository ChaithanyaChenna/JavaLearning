package com.numberpro;

public class SumWithOutModulas {
    public static void main(String[] args)
    {
        String s="23412";
        int sum=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
           sum=sum+Character.getNumericValue(a[i]);
        }
        System.out.println(sum);
    }
}
