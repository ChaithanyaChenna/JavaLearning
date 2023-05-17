package com.numberpro;

public class nCrProgram {
    public static int calNcR(int n,int r)
    {
        int nCr=fact(n)/(fact(r)*fact(n-r));
        return nCr;
    }
    public static int fact(int num)
    {
        int i=1,sum=1;
        while(i<num)
        {
            sum=sum*(i+1);
              i++;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int nCr=calNcR(5,2);//here r value must be lesser than or equal to n;
        System.out.println(nCr);
    }
}
