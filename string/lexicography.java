package string;

import java.util.*;
public class lexicography
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=" ";
        System.out.println("enter a string");
        String str=sc.nextLine();
        String Str=str.toUpperCase();
        int l=Str.length();
        for(int i=65;i<=90;i++)
        {
            char ch1=(char)i;
            for(int j=0;j<l;j++) 
            {
               char ch=Str.charAt(j);
               if(ch==ch1)
               s=s+ch;
            }
        }
        System.out.println(s);
    }
}

            
        
    

            
        