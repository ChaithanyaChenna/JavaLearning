package com.array.programs;

public class FrequencyOfeachElement {
    public static void main(String[] args)
    {
        int count=1;
        int a[]={1,2,8,3,2,2,2,5,1};
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }

            }
            System.out.println("frequency of" +a[i]+" is "+count);
            count=1;
        }
    }
}
