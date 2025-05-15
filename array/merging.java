package array;

import java.util.*;
public class merging
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int a[]=new int[6];
        int b[]=new int[4];
        int c[]=new int[10];
        for(i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<6;i++)
        { c[i]=a[i];
        }
        n=0;
         for(i=0;i<4;i++)
        { c[i]=b[n];
            n++;
        }
        
        for(i=0;i<10;i++)
        {
            System.out.println(c[i]);
        }
    }
}
