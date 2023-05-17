package com.array.programs;

import static org.apache.coyote.http11.Constants.a;

public class PrintEvenPositions {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(count%2==0)
            {
                System.out.println(arr[i]);
            }
            count++;
        }
    }
}
