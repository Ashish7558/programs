package array;

import java.util.*;
public class bubble
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<9;i++)
        {   
            for(j=0;j<9;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<10;i++)
        {
           System.out.println(a[i]);
        }
    }
}

            
