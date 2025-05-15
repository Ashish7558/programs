package array;

import java.util.*;
public class diaarray
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,sum1=0,sum2=0;
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                sum1=sum1+a[i][j];
            }
        }
        System.out.println(sum1);
         for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i+j==2)
                sum2=sum2+a[i][j];
            }
        }
        System.out.println(sum2);
    }
}