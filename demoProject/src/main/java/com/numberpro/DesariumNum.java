package com.numberpro;

public class DesariumNum {
    //int sum = 0, rem = 0, len = 0;

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
        int num=175;
        int result=num;
        int sum=calSum(num);
        if(result==sum){
            System.out.println("The given number is Desarium number");
        }
    }
}
