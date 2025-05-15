package array;

import java.util.Scanner;
public class binarynames
{

    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        int name[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("enter the names");
            name[i]=sc.nextInt();
        }
        System.out.println("enter the name to be searched");
        String n=sc.next();
        int lb=0,ub=9,mid=0,f=0;
        while(lb<=ub)
        {
           mid=(lb+ub)/2;
           if(n.equalsIgnoreCase(String.valueOf(name[mid])))
           {
               System.out.println(n);
           }
           else
           if(n.compareTo(name[mid]>0))
           {lb=mid+1;
           }
           else
           ub=mid-1;
        }
    }
}

            
            
        