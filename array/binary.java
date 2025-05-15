package array;

import java.util.*;
public class binary
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        int a[]=new int[10];
        for(i=0;i<20;i++)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        int lb=0,ub=19,mid=0,f=0;
        while(lb<=ub)
        {
           mid=(lb+ub)/2;
           if(a[mid]==n)
           f=1;
           if(a[mid]>n)
           ub=mid-1;
           if(a[mid]<n)
           lb=mid+1;
           
        }
            if(f==1)
            System.out.println("no found");
            else
            System.out.print("no not found");
    }
}

            
            
        