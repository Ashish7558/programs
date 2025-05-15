package array;

import java.util.*;
public class darray
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        int a[][]=new int[4][4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}