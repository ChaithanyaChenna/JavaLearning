package com.numberpro;

public class AbundentNummber1To100 {

    public static int calSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
public static void main(String args[])
{
    for(int i=1;i<=100;i++)
    {
        int sum=calSum(i);
        if(sum>i)
        {
            System.out.println(i +" ");
        }

    }
}
}
