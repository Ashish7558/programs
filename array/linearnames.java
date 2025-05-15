package array;

import java.util.*;
public class linearnames
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp=0;
        String name[]=new String[10];
        for(i=0;i<20;i++)
        {
            System.out.println("enter the names");
            name[i]=sc.next();
        }
        System.out.println("enter the name to be searched");
        String n= sc.nextLine();
        for(j=0;j<20;j++)
        {   
            int f=0;
            if(name[j].compareTo(n)==0)
            {  
               f=1;
            }
            if(f==1)
            System.out.println(n);
            else
            System.out.print("name not found");
        }
    }
}
            
            
        