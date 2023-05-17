package com.numberpro;

public class PronicNumber1To100 {
    public static boolean isPronic(int num)
    {
        boolean flag=false;
        for(int j=1;j<num;j++)
        {
            int c=j*(j+1);
            if (c==num)
            {
                flag=true;
            }
        }

        return flag;
    }
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(isPronic(i))
            {
                System.out.println(i+" ");
            }
        }
    }
}
