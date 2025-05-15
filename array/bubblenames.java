package array;

import java.util.*;
public class bubblenames
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        String temp="";
        String a[]=new String[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.next();
        }
        for(i=0;i<9;i++)
        {   
            for(j=0;j<9;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
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

            
