package com.NumberProjramsJavapoint;

public class AverageNum2 {

    int rem,sum=0,len=0;
    int num;
    public double calAverage(int num)
    {
        while(num!=0)
        {
          rem=num%10;
          sum=sum+rem;
          len++;
          num=num/10;
        }
        System.out.println(len);
        System.out.println(sum);
        double average=(sum/len);
        return average;
    }
//    public int calSum(int num)
//    {
//        System.out.println(num);
//        while (num!=0)
//        {
//            rem=num%10;
//            sum1=sum1+rem;
//            num=num/10;
//        }
//        System.out.println(num);
//        System.out.println(sum1);
//        return sum;
//    }
//    public float average(int len,int sum)
//    {
//        float average=sum/len;
//       return average;
//    }

    public static void main(String args[])
    {
   AverageNum2 a=new AverageNum2();
      double average=a.calAverage(12345);
      System.out.println(average);

    }
}