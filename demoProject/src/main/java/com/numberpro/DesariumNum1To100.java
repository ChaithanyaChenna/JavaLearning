package com.numberpro;

public class DesariumNum1To100 {
    public static int calLength(int num) {
        int len=0;
        while (num > 0) {
            len++;
            num = num / 10;
        }
        return len;
    }

    public static int calSum(int num) {
        int len=calLength(num);
        int rem,sum=0;

        while(num>0)
        {
            rem=num%10;
            sum=sum+(int)Math.pow(rem,len);
            num=num/10;
            len--;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {

        int result=calSum(i);
        if(result==i){
            System.out.println(i+" ");
        }
    }
        }
}
