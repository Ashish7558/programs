package array;

import java.util.*;
public class linear
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        for(j=0;j<10;j++)
        {   
            int f=0;
            if(n==a[j])
            {  
               f=1;
            }
            if(f==1)
            System.out.println("no found");
            else
            System.out.print("no not found");
        }
    }
}
            
            
        