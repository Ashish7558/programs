package string;

import java.util.*;
public class frequency
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        int c;
        char ch1=' ';
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        for(int i=65;i<=90;i++)
        {c=0;
            char ch=(char)i;
            for(int j=0;j<l;j++) 
            {  
               ch1=Str.charAt(j);
               if(ch1==ch)
               c++;}
             System.out.println(ch1+"  "+c);
        
         
       }
    }        
}      
    

            