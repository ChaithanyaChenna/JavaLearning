package com.numberpro;

public class HappyNumber1To100
{
        public static int calSum(int num)
        {
            int rem,sum=0;
            while(num>0)
            {
                rem=num%10;
                sum=sum+(rem*rem);
                num=num/10;
            }
            return sum;
        }
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                int result = i;

                while (result != 1 && result != 4) {
                    result = calSum(result);
                }
                if (result == 1) {
                    System.out.println(i+" ");
                }
                }
            }
        }



