package com.numberpro;

public class SumWithOutModulas1 {
    public static void main(String[] args)
    {
        String str="2341246";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char a=str.charAt(i);
            sum=sum+Character.getNumericValue(a);
        }
        System.out.println(sum);
    }
}
