package array;

import java.util.*;
public class selectionnames
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,min;
        String temp="";
        String a[]=new String[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.next();
        }
        for(i=0;i<9;i++)
        {   min=i;
            for(j=i+1;j<10;j++)
            {
                if(a[j].compareTo(a[min]<0))
                { min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
