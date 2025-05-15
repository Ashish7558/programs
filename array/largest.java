package array;

import java.util.*;
public class largest
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        int a[]=new int[10];
        int max;
        for(i=0;i<10;i++)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}
            
            
        