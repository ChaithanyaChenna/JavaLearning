package com.NumberProjramsJavapoint;

public class Program10 {
    //static int num1;

    //Program to determine whether a given number is an abundant number
    //A first abundant number is the integer 12 having the sum (16) of its
    // proper divisors (1, 2, 3, 4, 6) which is greater than itself (12).
    public static int sumOf(int num) {
        //num1 = num;
        int i = 1, sum = 0;

        while (i >= 1) {
            if (i == num) {
                break;
            }
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String args[]) {
       // int sum = sumOf(12);
       //System.out.println(sum);
        for(int i=1;i<=100;i++)
        {
            int sum=sumOf(i);
            if(sum>i)
            {
                System.out.println(i+"");
            }
        }
    }
}
