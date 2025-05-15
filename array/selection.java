package array;

import java.util.*;
public class selection
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0,max;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<9;i++)
        {   max=i;
            for(j=i+1;j<10;j++)
            {
                if(a[j]>a[max])
                { max=j;
                }
            }
            temp=a[i];
            a[i]=a[max];
            a[max]=temp;
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
